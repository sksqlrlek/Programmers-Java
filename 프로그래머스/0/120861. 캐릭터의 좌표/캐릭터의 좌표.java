class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        
        for(String a : keyinput) {
            if(a.equals("up")) {
                answer[1] = answer[1] >= (board[1] / 2) ? answer[1] : answer[1] + 1;
            } else if (a.equals("down")) {
                answer[1] = answer[1] <= -(board[1] / 2) ? answer[1] : answer[1] - 1;
            } else if (a.equals("left")) {
                answer[0] = answer[0] <= -(board[0] / 2) ? answer[0] : answer[0] - 1;
            } else {
                answer[0] = answer[0] >= (board[0] / 2) ? answer[0] : answer[0] + 1;
            }
        }
        return answer;
    }
}