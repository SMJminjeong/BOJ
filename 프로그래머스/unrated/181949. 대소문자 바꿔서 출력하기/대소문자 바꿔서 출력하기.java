import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        
        for(int i = 0; i<a.length(); i++){
            char target = a.charAt(i);
            if(Character.isUpperCase(target)){
                answer += Character.toLowerCase(target);
            }
            if(Character.isLowerCase(target)){
                answer += Character.toUpperCase(target);
            }
        }
        System.out.println(answer);
    }
}