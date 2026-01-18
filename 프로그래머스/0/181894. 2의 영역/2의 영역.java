import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int max = -1;
        int min = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                if (min == -1) {
                    min = i;
                }
                max = i;
            } 
        }
        if (min == -1) {
            return new int[]{-1};
        }
        return Arrays.copyOfRange(arr, min, max + 1);
    }
}