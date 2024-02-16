import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        primeNumber(N, K);
    }

    static void primeNumber (int N, int K) {
        int[] intArr = new int[N+1];
        for (int i = 2; i <= N; i++) {
            intArr[i] = i;
        }
        for (int i = 2; i <= N; i++) {
            if (intArr[i] == 0) continue;
            for (int j = i; j <= N; j+=i) {
                if (intArr[j] != 0) { 
                    intArr[j] = 0;
                    K--;
                    if (K == 0) {
                        System.out.println(j);
                        return;
                    }
                }
            }
        }
    }


}
