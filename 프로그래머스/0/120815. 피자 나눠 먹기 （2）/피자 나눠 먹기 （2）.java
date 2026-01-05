class Solution {
    public int solution(int n) {
        int lcm = (n * 6) / gcd(n, 6);
        int answer = lcm / 6;
        return answer;
    }
    
    public int gcd(int a, int b){
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
}