class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String a1 = String.valueOf(a);
        String b1 = String.valueOf(b);
        int sum1 = Integer.parseInt(a1 + b1);
        int sum2 = Integer.parseInt(b1 + a1);
        
        if (sum1 > sum2) {
            answer = sum1;
        } else {
            answer = sum2;
        }
        return answer;
    }
}