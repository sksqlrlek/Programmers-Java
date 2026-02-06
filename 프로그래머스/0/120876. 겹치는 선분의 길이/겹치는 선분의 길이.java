class Solution {
    public int solution(int[][] lines) {
        int[] count = new int[201];
        int answer = 0;
        for (int[] line : lines) {
            int a = Math.min(line[0], line[1]);
            int b = Math.max(line[0], line[1]);
            
            for (int i = a; i < b; i++) {
                count[i + 100]++;
            }
        }
        
       for(int c : count) {
           if(c >= 2) {
               answer++;
           }
       } 
        
        return answer;
    }
}