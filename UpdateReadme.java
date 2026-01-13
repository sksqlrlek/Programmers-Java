import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class UpdateReadme {
    public static void main(String[] args) throws IOException {
        // 이미지 확인 결과, 최상위 폴더명이 "프로그래머스"입니다.
        String baseDir = "프로그래머스"; 
        Path rootPath = Paths.get(baseDir);

        if (!Files.exists(rootPath)) {
            System.out.println("폴더를 찾을 수 없습니다: " + baseDir);
            return;
        }

        // 1. 모든 하위 폴더를 탐색하여 문제 정보 수집
        StringBuilder tableContent = new StringBuilder();
        tableContent.append("\n| 레벨 | 문제 명 | 풀이 코드 |\n");
        tableContent.append("| :---: | :--- | :---: |\n");

        // Files.walk를 사용하여 '레벨 폴더(0)' 안의 '문제 폴더'들을 찾아냅니다.
        List<Path> problemFolders = Files.walk(rootPath, 3) 
                .filter(Files::isDirectory)
                // 문제 폴더는 보통 숫자로 시작하는 이름이므로 이를 필터링 조건으로 씁니다.
                .filter(p -> p.getFileName().toString().matches("^[0-9].*")) 
                .sorted()
                .collect(Collectors.toList());

        for (Path folder : problemFolders) {
            // folder.getParent()는 '0', '1' 같은 레벨 폴더가 됩니다.
            String level = "Lv." + folder.getParent().getFileName().toString(); 
            String problemName = folder.getFileName().toString();
            
            // 링크 생성 (공백 처리)
            String rawPath = folder.toString().replace("\\", "/"); // 윈도우 경로 대비
            String encodedPath = rawPath.replace(" ", "%20");
            
            tableContent.append(String.format("| %s | %s | [바로가기](%s) |\n", level, problemName, encodedPath));
        }

        // 2. README.md 업데이트
        updateReadmeFile(tableContent.toString());
    }

    private static void updateReadmeFile(String newTable) throws IOException {
        Path readmePath = Paths.get("README.md");
        if (!Files.exists(readmePath)) {
            Files.write(readmePath, Collections.singletonList("# 코딩 테스트 풀이 현황\n"));
        }

        List<String> lines = Files.readAllLines(readmePath);
        List<String> resultLines = new ArrayList<>();

        for (String line : lines) {
            resultLines.add(line);
            if (line.contains("")) {
                resultLines.add(newTable);
                // 이후에 기존에 있던 표가 중복으로 붙지 않도록 하려면 추가 로직이 필요하지만, 
                // 지금은 일단 가장 심플한 버전으로 드립니다.
            }
        }
        Files.write(readmePath, resultLines);
        System.out.println("현황판 업데이트 완료!");
    }
}
