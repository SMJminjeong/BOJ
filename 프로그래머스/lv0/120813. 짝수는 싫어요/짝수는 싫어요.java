class Solution {
    public int[] solution(int n) {
        int[] answer;
        
        //배열의 크기 지정
        if(n%2 == 0){
            answer = new int[n / 2];
            System.out.println(answer);
        }else{
            answer = new int[n / 2 + 1];
        }
        
        //배열의 index
        int index = 0;

        //반복문으로 n 돌면서 홀수 찾기
        for(int i = 0; i<n+1; i++){
            if(i%2 == 1){
            answer[index] = i;
            index++;
            }
        }
        
        return answer;
    }
}