class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        //10인분 먹으면 음료수 하나 서비스
        int ten = n/10;
        //음료수가 0개가 아니고 양꼬치가 10인분 배수일 경우
        if(k != 0){
            if(ten != 0) k = k-ten;
        }
        
        if(k != 0){
        answer = (n * 12000) + (k * 2000);
        }
        else answer = n*12000;
        
        return answer;
    }
}