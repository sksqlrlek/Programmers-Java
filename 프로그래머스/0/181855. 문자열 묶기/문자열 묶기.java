class Solution {
    public int solution(String[] strArr) {

        int len = 0;
    
        for(String str : strArr) {
            len = Math.max(len, str.length());
        }
        
        int[] strLen = new int[len + 1];
        int answer = 0;
        for(String n : strArr) {
            strLen[n.length()] = strLen[n.length()] + 1;

            if (strLen[n.length()] > answer) {
                answer = strLen[n.length()];
            }
        }
        return answer;
    }
}