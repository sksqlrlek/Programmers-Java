class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < myString.length(); i++) {
            if(myString.charAt(i) == 'a'){
                sb.append('A'); 
            } else if(myString.charAt(i) >= 66 && myString.charAt(i) <= 90) {
                sb.append(Character.toLowerCase(myString.charAt(i)));
            } else {
                sb.append(myString.charAt(i));
            }
        }
        return sb.toString();
    }
}