class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int line1 = Math.max(sides[0], sides[1]);
        int line2 = Math.min(sides[0], sides[1]);
        for(int i = line1; i > line1 - line2; i--) {
            answer++;
        }
          
        for (int i = line1 + 1; i < line1 + line2; i++){
            answer++;
        }
        return answer;
    }
}