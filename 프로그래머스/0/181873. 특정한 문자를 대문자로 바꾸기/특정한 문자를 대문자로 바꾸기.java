class Solution {
    public String solution(String my_string, String alp) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            if(String.valueOf(my_string.charAt(i)).equals(alp)) {
                sb.append(Character.toUpperCase(my_string.charAt(i)));
                continue;
            }
            sb.append(my_string.charAt(i));
        }
        return sb.toString();
    }
}