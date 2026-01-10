class Solution {
    public int solution(int hp) {
        int answer = hp / 5;
        int lastHp = hp % 5;
        answer += lastHp / 3;
        answer += lastHp % 3;
        
        return answer;
    }
}