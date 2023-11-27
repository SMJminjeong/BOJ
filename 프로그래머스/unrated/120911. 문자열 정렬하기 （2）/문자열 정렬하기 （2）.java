import java.util.Arrays;

class Solution {

    public String solution(String my_string) {

        String answer = "";

        String lowerString = my_string.toLowerCase();
        char[] chArray = lowerString.toCharArray();
        Arrays.sort(chArray);

        answer = new String(chArray);

        return answer;

    }

}