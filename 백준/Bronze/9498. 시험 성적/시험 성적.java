import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		
		System.out.print((A>=90)?"A": (A>=80)? "B": (A>=70)? "C": (A>=60)? "D": "F");
	}
}