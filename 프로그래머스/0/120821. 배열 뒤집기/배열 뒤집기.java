class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int tmp = 0;
        for(int i = 0; i < num_list.length; i++){
            answer[i] = num_list[i];
        }
        for(int i = 0; i < num_list.length / 2; i++) {
            tmp = answer[i];
            answer[i] = answer[num_list.length - i - 1];
            answer[num_list.length - i - 1] = tmp;
        }
        return answer;
    }
}