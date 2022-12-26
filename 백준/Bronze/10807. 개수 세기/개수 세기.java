import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Map<Integer, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()){
            int m = Integer.parseInt(st.nextToken());
            map.put(m, map.getOrDefault(m,0)+1);
        }
        int v = Integer.parseInt(br.readLine());

        if(map.containsKey(v)){
            System.out.println(map.get(v));
        }else{
            System.out.println(0);
        }
    }
}