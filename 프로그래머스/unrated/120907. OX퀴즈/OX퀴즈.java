import java.util.List;
import java.util.Arrays;

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

    for(int i = 0; i<quiz.length; i++){
        String[] quizArr = quiz[i].split(" "); 
        List<String> quizList = Arrays.asList(quizArr);

        if(quizList.contains("+")){
            int a = Integer.parseInt(quizArr[0]);
            int b = Integer.parseInt(quizArr[2]);

            int sum = a + b;
            int target = Integer.parseInt(quizArr[quizArr.length-1]);
            
            if(sum == target){
                answer[i] = "O";
            }else{
                answer[i] = "X";
            }
        }else {
            int a = Integer.parseInt(quizArr[0]);
            int b = Integer.parseInt(quizArr[2]);

            int sum = a - b;
            int target = Integer.parseInt(quizArr[quizArr.length-1]);
            
            if(sum == target){
                answer[i] = "O";
            }else{
                answer[i] = "X";
            }
        }
    }


        return answer;
    }
}