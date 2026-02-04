class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        boolean[][] danger = new boolean[n][n];
        int answer = 0;
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == 1) {
                    for(int x = i - 1; x <= i + 1; x++) {
                        for(int y = j - 1; y <= j + 1; y++) {
                            if(x >= 0 && x < n && y >= 0 && y < n) {
                                danger[x][y] = true;
                            }
                        }
                    }
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!danger[i][j]) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}