class Solution {
    public int solution(String my_string) {
        String[] spl = my_string.split(" ");
        
        int answer = Integer.parseInt(spl[0]);
        
        for(int i = 1; i < spl.length; i += 2) {
            String PM = spl[i];
            int num = Integer.parseInt(spl[i + 1]);
            
            if(PM.equals("+")) {
                answer += num;
            } else {
                answer -= num;
            }
        }
        return answer;
    }
}