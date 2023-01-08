class Solution {
    public int GCD(int num1, int num2){
        if(num1 % num2 == 0){
            return num2;
        }
        return GCD(num2, num1%num2);
    }
    
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        //기약분수 : 더이상 약분할 수 없는 분수
        int denum3 = (denum1 * num2) + (denum2 * num1);
        int num3 = num1 * num2;
         
        int[] answer = {denum3, num3};
        int max = GCD(answer[0], answer[1]);
        
        answer[0] /= max;
        answer[1] /= max;
        
        return answer;
    }
}