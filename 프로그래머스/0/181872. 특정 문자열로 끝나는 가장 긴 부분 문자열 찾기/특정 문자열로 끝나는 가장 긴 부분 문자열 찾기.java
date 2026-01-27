class Solution {
    public String solution(String myString, String pat) {
        int num = myString.lastIndexOf(pat);
        return myString.substring(0, num + pat.length());
    }
}