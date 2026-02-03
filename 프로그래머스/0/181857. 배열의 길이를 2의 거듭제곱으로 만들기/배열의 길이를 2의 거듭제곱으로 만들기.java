class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int n = 1;
        
        while (len > n) {
            n *= 2;
        }
            
        if (len == n) {
            return arr;
        }
        
        int[] answer = new int[n];
        System.arraycopy(arr, 0, answer, 0, len);
        return answer;
    }
}