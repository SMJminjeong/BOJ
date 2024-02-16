import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        BigInteger bigInteger = new BigInteger("1");
        for (int i = 1; i <= N; i++) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
        }

        String S = bigInteger.toString();
        for (int i = S.length() - 1; i > 1; i--) {
            if (S.charAt(i) - '0' == 0) {
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}
