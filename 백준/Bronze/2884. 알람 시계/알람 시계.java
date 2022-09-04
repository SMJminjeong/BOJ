import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();	
		int M = sc.nextInt();
		if((M - 45) < 0) {
			if((H -1) < 0) {
				H = - 1 + 24;
				M = M - 45 + 60;
			} else {
				H -= 1;
				M = M - 45 + 60;
			}
			
		} else {
			M = M - 45;
		}
		
		System.out.print(H + " " + M);
	}
}