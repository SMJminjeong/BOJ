class Solution {

    public int solution(String my_string) {

        int answer = 0;
        StringBuilder currentNum = new StringBuilder();

        for(char ch : my_string.toCharArray()){
            if(Character.isDigit(ch)){
                currentNum.append(ch);
            }
            else{
                if(currentNum.length() > 0){
                    answer += Integer.parseInt(currentNum.toString());
                    currentNum = new StringBuilder();
                }
            }
        }

        if (currentNum.length() > 0) {
            answer += Integer.parseInt(currentNum.toString());
        }

        return answer;

    }

}