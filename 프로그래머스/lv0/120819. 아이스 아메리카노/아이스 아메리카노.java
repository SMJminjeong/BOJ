class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int americano = 5500;
        // 머쓱이가 마실수 있는 아메리카노의 잔 수
        int cup = money/americano;
        // 머쓱이가 아메리카노 사고 남은 돈
        int change = money % americano;
        
        answer[0] = cup;
        answer[1] = change;
        
        return answer;
    }
}