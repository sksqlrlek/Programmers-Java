class Solution {
    public int solution(int[][] dots) {
        if (eq(dots, 0, 1, 2, 3)){
            return 1;
        }
        if (eq(dots, 0, 2, 1, 3)){
            return 1;
        }
        if (eq(dots, 0, 3, 1, 2)){
            return 1;
        }
        return 0;
    }
    
    public boolean eq (int[][] dots, int a, int b, int c, int d) {
        int dx1 = dots[b][0] - dots[a][0];
        int dy1 = dots[b][1] - dots[a][1];
        int dx2 = dots[d][0] - dots[c][0];
        int dy2 = dots[d][1] - dots[c][1];

        return (long) dy1 * dx2 == (long) dy2 * dx1;
    }
}