class Solution {
    public int solution(int n) {
        //최소공배수
        int pizza = n / (gcd(n,6));
        return pizza;
    }
    
    public static int gcd(int a, int b){
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a; //최대공약수
    }
}