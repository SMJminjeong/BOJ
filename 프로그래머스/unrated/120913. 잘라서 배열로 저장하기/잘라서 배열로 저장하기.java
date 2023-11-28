import java.util.ArrayList;

class Solution {

    public String[] solution(String my_str, int n) {

        ArrayList<String> answerList = new ArrayList<>();

        for(int i = 0; i<my_str.length(); i += n){
            if(i + n < my_str.length()){
                answerList.add(my_str.substring(i, i + n));
            } else {
                answerList.add(my_str.substring(i));
            }
        }

        String[] answer = answerList.toArray(new String[0]);

        return answer;

    }

}