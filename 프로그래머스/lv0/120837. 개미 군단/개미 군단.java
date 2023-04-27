class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        if(hp%5 == 0) {
            answer = hp/5;
            return answer;
        }
        else{
            int a = hp/5; //장군개미
            answer += a;
            int rest = hp%5;
            
            if(rest % 3 == 0){
                answer = answer + (rest/3); //병정개미
                return answer;
            }
            else{
                int b = rest / 3;
                rest = rest % 3; //일병개미
                answer = a + b + rest;
                return answer;
            }
        }
        
    }
}