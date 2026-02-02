class Solution {
    public String solution(String polynomial) {
        String[] arr = polynomial.split(" ");
        int a = 0;
        int b = 0;
        for(String n : arr) {
            if(n.contains("+")) {
                continue;
            }
            
            if(n.contains("x")) {
                if(n.equals("x")){
                    a += 1;
                } else {
                    a += Integer.parseInt(n.replace("x", ""));
                }
            } else {
                b += Integer.parseInt(n);
            }           
        }
        
        StringBuilder sb = new StringBuilder();
        
        if(a != 0) {
            if (a == 1) {
                sb.append("x");
            } else {
                sb.append(a);
                sb.append("x");
            }
        }
        
        if(b != 0) {
            if(sb.length() > 0) {
                sb.append(" + ");
            }
            sb.append(b);
        }
        
        if(sb.length() == 0) {
            return "0";
        }
        return sb.toString();
    }
}