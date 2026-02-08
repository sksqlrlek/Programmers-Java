import java.util.Arrays;

class Solution {
    public int[] solution(int[][] score) {
        int[] avg = Arrays.stream(score).mapToInt(x -> x[0] + x[1]).toArray();
        
        int[] rank = new int[avg.length];
        for(int i = 0; i < rank.length; i++) {
            int r = 1;
            for(int j = 0; j < rank.length; j++) {
                if(avg[j] > avg[i]) {
                    r++;
                }
            }
            rank[i] = r;
        }
        return rank;
    }
}