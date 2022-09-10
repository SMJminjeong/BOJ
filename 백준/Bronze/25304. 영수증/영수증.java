import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int N = scanner.nextInt();
        int order = 0;
        
        for(int i=1; i<=N; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            order += a*b;
        }
        if(X==order){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}