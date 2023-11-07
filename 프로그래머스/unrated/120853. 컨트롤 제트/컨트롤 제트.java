import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;


class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split(" ");
        List<String> wordString = new ArrayList<>(Arrays.asList(arr));
        String target = "Z";
        
        for(int i = 0; i<wordString.size(); i++){
            if(!wordString.get(i).equals(target)){
                answer += Integer.parseInt(wordString.get(i));
            } else {
                answer -= Integer.parseInt(wordString.get(i - 1));
            }
        }
  
        
        return answer;
    }
}