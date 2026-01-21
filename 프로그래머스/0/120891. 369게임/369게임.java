class Solution {
    public int solution(int order) {
        int answer = 0;
        String StrOrder = String.valueOf(order);
        for(int i = 0; i < StrOrder.length(); i++) {
            if(StrOrder.charAt(i) == '3'
               || StrOrder.charAt(i) == '6'
               || StrOrder.charAt(i) == '9'){
                answer++;
            }
        }
        return answer;
    }
}