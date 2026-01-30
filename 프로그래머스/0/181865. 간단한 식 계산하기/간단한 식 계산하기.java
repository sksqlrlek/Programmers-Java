class Solution {
    public int solution(String binomial) {
        String[] calc = binomial.split(" ");
        int a = Integer.parseInt(calc[0]);
        int b = Integer.parseInt(calc[2]);
        int result = 0;
        
        switch(calc[1]) {
            case "+" : result = a + b; break;
            case "-" : result = a - b; break;
            case "*" : result = a * b; break;
        }
        return result;
    }
}