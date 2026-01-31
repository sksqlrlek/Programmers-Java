class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(my_str.length() + n - 1) / n];
        int a = 0;
        for(int i = 0; i < answer.length; i++){
            int b = Math.min(a + n, my_str.length());
            answer[i] = my_str.substring(a, b);
            a += n;
        }
        return answer;
    }
}