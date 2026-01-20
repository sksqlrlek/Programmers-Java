class Solution {
    public int[] solution(int[] num_list, int n) {
        int arrLeg = num_list.length;
        int[] answer = new int[arrLeg % n == 0 ? arrLeg / n : arrLeg / n + 1];
        int idx = 0;
        for(int i = 0; i < answer.length; i++) {
            answer[i] = num_list[idx];
            idx += n;
        }
        return answer;
    }
}