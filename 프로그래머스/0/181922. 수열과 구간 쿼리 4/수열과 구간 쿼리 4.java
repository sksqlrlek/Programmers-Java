class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int j = 0; j < queries.length; j++) {
            int s = queries[j][0];
            int e = queries[j][1];
            int k = queries[j][2];
            for(int i = 0; i < arr.length; i++) {
                if((i >= s && i <= e) && i % k == 0) {
                    ++arr[i];
                } 
            }
        }
        return arr;
    }
}