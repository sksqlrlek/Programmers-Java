class Solution {
    public int[] solution(int n) {
        int count = 0;
        int idx = 1;
        int tmp = n;
        
        while (tmp != 1) { 
            tmp = colach(tmp);
            count++;
        }

        int[] answer = new int[count + 1];
        tmp = n;
        for (int i = 0; i <= count; i++) {
            answer[i] = tmp;
            tmp = colach(tmp);
        }
        return answer;
    }
    
    public int colach(int a) {
        if(a % 2 == 0) {
            return a / 2;
        } else {
            return (3 * a + 1);
        }
    }
}