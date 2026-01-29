import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        char[] strArr = my_string.toLowerCase().toCharArray();
        Arrays.sort(strArr);
        
        return String.valueOf(strArr);
    }
}