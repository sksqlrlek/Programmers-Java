import java.util.Arrays;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        Integer[] idx = new Integer[rank.length];
        for(int i = 0; i < idx.length; i++) {
            idx[i] = i;
        }
        
        Arrays.sort(idx, (a, b) -> Integer.compare(rank[a], rank[b]));
        
        int[] player =new int[3];
        int n = 0;
        for (int i : idx) {
            if(attendance[i]) {
                player[n++] = i;
                if(n == 3) {
                    break;
                }
            }
        }

        return (player[0] * 10000) + (player[1] * 100) + (player[2] * 1);
    }
}