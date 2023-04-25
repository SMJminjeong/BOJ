class Solution {
    public String solution(int age) {
        String answer = "";
        String ageToString = "abcdefghij";
        
        String[] ageArr = String.valueOf(age).split("");
        
        for(int i = 0; i < ageArr.length; i++){
            answer += ageToString.charAt(Integer.valueOf(ageArr[i]));
        }
        
        return answer;
    }
}