class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] para = quiz[i].split(" ");
            
            int x = Integer.parseInt(para[0]);
            String op = para[1];
            int y = Integer.parseInt(para[2]);
            int z = Integer.parseInt(para[4]);
            
            int calc = op.equals("+") ? x + y : x - y;
            answer[i] = z == calc ? "O" : "X";
        }
        return answer;
    }
}