import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

interface Main{
    static void main(String[]a) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = "", result = "";
        String regex = "^[^aeiou]+$|[aeiou]{3,}|[^aeiou]{3,}|([^eo])\\1+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        while(!(str = br.readLine()).equals("end")) {
          matcher = pattern.matcher(str);
          result = matcher.find()?"not acceptable.":"acceptable.";
          bw.write("<"+str+"> is " + result);
          bw.newLine();
        };
        
        bw.flush();
    }
}