class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            answer = threeX(answer);
        }
        return answer;
    }

    public int threeX(int num) {
        num++;
        while (num % 3 == 0 || String.valueOf(num).contains("3")) {
            num++;
        }
        return num;
    }
}