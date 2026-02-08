class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i = 0; i < babbling.length; i++) {
            String baby = babbling[i].replace("aya", " ").replace("ye", " ").replace("woo", " ")
                .replace("ma", " ");
            if(baby.trim().isEmpty()) {
                answer++;
            }
        }
        
        return answer;
    }
}