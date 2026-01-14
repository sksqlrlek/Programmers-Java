class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 1;
        while(true) {
            int product = 1;
            for(int i = 1; i <= num; i++) {
                product *= i;
            }
            if(n >= product) {
                answer = num;
            } else {
                break;
            }
            num++;
        }
        return answer;
    }
}