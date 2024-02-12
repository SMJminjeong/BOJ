import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        
        String[] str = br.readLine().split("");
        
        for(String a : str) {
            result += Integer.parseInt(a);
        }
        
        System.out.println(result);
    }
}