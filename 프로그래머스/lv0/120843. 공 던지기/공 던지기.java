class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int count = 0;
        
        for(int i = 0; i<numbers.length; i++){
            answer = numbers[i];
            i++;
            if(i == numbers.length){
                i = 0;
            }
            if(i == numbers.length-1){
                i = -1;
            }
            count++;
            if(count == k){
                return answer; 
            }
        }
        return answer;
    }
}