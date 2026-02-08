import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Integer[] arr = Arrays.stream(numlist).boxed().toArray(Integer[]::new);
        
        Arrays.sort(arr, (a, b) -> {
            int lenA = Math.abs(a - n);
            int lenB = Math.abs(b - n);
            
            if(lenA != lenB) {
                return lenA - lenB;
            }
            return b - a;
        });
        return Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
    }
}