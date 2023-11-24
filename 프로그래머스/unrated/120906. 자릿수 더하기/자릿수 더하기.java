class Solution {
    public int solution(int n) {
        int answer = 0;
        String intStr = Integer.toString(n);
        
        for (int i = 0; i < intStr.length(); i++) {
            answer += Character.getNumericValue(intStr.charAt(i));
        }
        
        return answer;
    }
}