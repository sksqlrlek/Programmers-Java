import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int count = 0;
        while(true) {
            int[] answer = new int[arr.length];

            for(int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    answer[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    answer[i] = (arr[i] * 2) + 1;
                } else {
                    answer[i] = arr[i];
                }
            }
            
            if (Arrays.equals(arr, answer)) {
                break;
            }

            arr = answer;
            count++;
        }
        return count;
    }
}