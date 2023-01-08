class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        //for 문 이용하여 *2
        for(int i = 0; i<numbers.length; i++){
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }
}