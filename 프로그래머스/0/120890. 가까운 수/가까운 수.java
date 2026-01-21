class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int diff = 1000000;
        for(int i = 0; i < array.length; i++) {
            int a = Math.abs(n - array[i]);
            if(a < diff || (a == diff && answer > array[i])) {
                answer = array[i];
                diff = a;
            }
        }
        return answer;
    }
}