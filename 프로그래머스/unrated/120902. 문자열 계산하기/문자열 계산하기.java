class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] strArray = my_string.split(" ");
        
        int num = 0;
        boolean isOperator = false;
        int sign = 1;

        for(String array : strArray){
            try {
                int number = Integer.parseInt(array) * sign;
                
                if(isOperator){
                    answer += num;
                    num = number;
                    isOperator = false;
                }else {
                    num = number;
                }
            } catch(NumberFormatException e) {
                if(array.equals("+")){
                    isOperator = true;
                    sign = 1;
                } else if (array.equals("-")){
                    isOperator = true;
                    sign = -1;
                }
            }
        }
        
        if(!isOperator){
            answer += num;
        }
        
        return answer;
    }
}