class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int tmp = 0;
        for(int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            
            tmp = arr[a];
            arr[a] = arr[b];
            arr[b] = tmp;
        }
        return arr;
    }
}