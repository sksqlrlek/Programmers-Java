class Solution {
    public String[] solution(String[] names) {
        int leng = 0;
        if(names.length % 5 == 0) {
            leng = names.length / 5;
        } else {
            leng = names.length / 5 + 1;
        }
        String[] answer = new String[leng];
        int idx = 0;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = names[idx];
            idx += 5;
        }
        return answer;
    }
}