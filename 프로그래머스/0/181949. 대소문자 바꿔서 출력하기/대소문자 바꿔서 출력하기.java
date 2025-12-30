import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        
        for(int i = 0; i < a.length(); i++) {
            char p = a.charAt(i);
            if(p >= 'A' && p <= 'Z'){
                result += Character.toLowerCase(p);
            } else {
                result += Character.toUpperCase(p);
            }
        }
        
        System.out.println(result);
    }
}