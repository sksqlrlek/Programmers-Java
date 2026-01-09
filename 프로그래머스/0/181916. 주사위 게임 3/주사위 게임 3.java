import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};
        Arrays.sort(dice);
        int p = 0;
        int q = 0;
        if (dice[0] == dice[3]) {
            return 1111 * dice[0];
        } else if (dice[0] == dice[2] || dice[1] == dice[3]) {
            p = dice[1];
            q = (dice[0] == dice[2]) ? dice[3] : dice[0];
            return (10 * p + q) * (10 * p + q);
        } else if (dice[0] == dice[1] && dice[2] == dice[3]) {
            p = dice[0];
            q = dice[2];
            return (p + q) * Math.abs(p - q);
        } else if (dice[0] == dice[1] || dice[1] == dice[2] || dice[2] == dice[3]) {
            if (dice[0] == dice[1]) {
                return dice[2] * dice[3];
            } else if (dice[1] == dice[2]) {
                return dice[0] * dice[3];
            } else {
                return dice[0] * dice[1];
            }
        } else {
            return dice[0];
        }
    }
}