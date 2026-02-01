import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = myStr.split("[abc]+");
        
        ArrayList<String> list = new ArrayList<>();
        for(String s : answer) {
            if(!s.isEmpty()) {
                list.add(s);
            }
        }
    
        if(list.isEmpty()) {
            return new String[] {"EMPTY"};
        }     
        
        return list.toArray(new String[0]);
    }
}