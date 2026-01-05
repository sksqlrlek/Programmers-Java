class Solution {
    public int solution(int n) {
        int answer = n / 7;
        if (n % 7 >= 1) {
            answer++;
        }
        return answer;
    }
}