class Solution {
    public int solution(String number) {
        String[] num = number.split("");
        int sum = 0;
        for(int i = 0; i < num.length; i++) {
            sum += Integer.parseInt(num[i]);
        }
        return sum % 9;
    }
}