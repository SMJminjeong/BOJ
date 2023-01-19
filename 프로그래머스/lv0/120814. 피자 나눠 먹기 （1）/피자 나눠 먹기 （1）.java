class Solution {
    public int solution(int n) {            
        int pizza = (n % 7 == 0) ? (n/7) : (n/7+1);        
        return pizza;
    }
}