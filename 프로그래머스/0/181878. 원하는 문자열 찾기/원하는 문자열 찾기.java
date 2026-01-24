class Solution {
    public int solution(String myString, String pat) {

        if (myString.toLowerCase().indexOf(pat.toLowerCase()) == -1) {
            return 0;
        } else {
            return 1;
        }
    }
}