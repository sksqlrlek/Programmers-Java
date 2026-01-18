class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        int count = 0;
        for (String a: strlist) {
            answer[count++] = a.length();
        }
        return answer;
    }
}