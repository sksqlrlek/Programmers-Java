class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] count = new int[1001];
        int maxCount = 0;
        
        for(int num : array) {
            count[num]++;
        }
        
        for(int i = 0; i < count.length; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                answer = i;
            } else if (count[i] == maxCount && count[i] != 0) {
                answer = -1;
            }
        }
        return answer;
    }
}