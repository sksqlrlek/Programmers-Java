import java.util.Set;
import java.util.HashSet;

class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        Set<Character> dup = new HashSet<>();
        
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if(dup.add(c)) {
                answer.append(c);
            }
        }
        return answer.toString();
    }
}