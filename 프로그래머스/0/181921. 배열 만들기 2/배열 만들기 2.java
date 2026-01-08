class Solution {
    public int[] solution(int l, int r) {
        int count = 0;
        int idx = 0;
        for(int i = l; i <= r; i++) {
            if(check(i)) {
                count++;
            }
        }
        
        if(count == 0) {
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[count];

        for(int i = l; i <= r; i++) {
            if(check(i)) {
                answer[idx++] = i;
            }
        }       
        
        return answer;
    }
    
    public boolean check(int a) {
        int tmp = a;
        while(tmp > 0) {
            int num = tmp % 10;
            if (num != 0 && num != 5) {
                return false;
            }
            tmp /= 10;
        }
        return true;
    }
}