import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();

        if(A>0 && B<10){
            int result = A-B;
            System.out.println(result);
        }else{
            System.out.println("A는 0이상 B는 10 이하여야 합니다.");
        }

    }
}
