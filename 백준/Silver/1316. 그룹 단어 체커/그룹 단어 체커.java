import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            String targetWord = br.readLine().trim();
            Set<Character> charSet = new HashSet<>();
            boolean isGroupWord = true;

            for (int j = 0; j < targetWord.length(); j++) {
                char currentChar = targetWord.charAt(j);

                if ((j > 0) && (currentChar != targetWord.charAt(j-1)) && (charSet.contains(currentChar))) {
                    isGroupWord = false;
                    break;
                }
                charSet.add(currentChar);
            }
            if (isGroupWord) {
                count++;
            }
        }
        System.out.println(count);
    }
}
