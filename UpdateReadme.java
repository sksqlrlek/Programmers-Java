import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class UpdateReadme {
    public static void main(String[] args) throws IOException {
        // [중요!] 본인의 프로그래머스 폴더 이름이 'Programmers'인지 '프로그래머스'인지 확인 후 수정하세요.
        String baseDir = "Programmers"; 
        Path rootPath = Paths.get(baseDir);

        if (!Files.exists(rootPath)) return;

        // 1. 폴더를 뒤져서 문제 리스트 만들기
        StringBuilder tableContent = new StringBuilder();
        tableContent.append("\n| 난이도 | 문제 명 | 풀이 코드 |\n");
        tableContent.append("| :---: | :--- | :---: |\n");

        // 폴더 구조를 탐색합니다 (Programmers -> Lv.1 -> 문제명)
        List<Path> problemFolders = Files.walk(rootPath, 2)
                .filter(Files::isDirectory)
                .filter(p -> p.getNameCount() > 2) // 레벨 폴더 아래의 문제 폴더만
                .sorted()
                .collect(Collectors.toList());

        for (Path folder : problemFolders) {
            String level = folder.getParent().getFileName().toString(); // Lv.1 등
            String problemName = folder.getFileName().toString(); // 문제이름
            String path = folder.toString().replace(" ", "%20");
            
            tableContent.append(String.format("| %s | %s | [바로가기](%s) |\n", level, problemName, path));
        }

        // 2. README.md 파일 읽어서 표 끼워넣기
        Path readmePath = Paths.get("README.md");
        List<String> lines = Files.readAllLines(readmePath);
        List<String> newLines = new ArrayList<>();

        for (String line : lines) {
            newLines.add(line);
            if (line.contains("")) {
                newLines.add(tableContent.toString());
                // 이 뒤에 기존에 있던 표 내용이 중복되지 않도록 처리하는 로직은 생략(간결함 위해)
            }
        }
        Files.write(readmePath, newLines);
    }
}
