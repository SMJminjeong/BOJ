import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = {3, 2, 1, 2, 3, 3, 3, 3, 1, 1, 3, 1, 3, 3, 1, 2, 2, 2, 1, 2, 1, 1, 2, 2, 2, 1};
        int sum = 0;
        String str = br.readLine();

        int[] strToIntArr = new int[str.length()]; 
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            strToIntArr[i] = arr[c - 'A'];
        }

        for (int value : strToIntArr) {
            sum += value;
            sum %= 10;
        }

        if (sum % 2 == 0) {
            System.out.println("You're the winner?");
        } else {
            System.out.println("I'm a winner!");
        }
    }
}

