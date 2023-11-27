class Solution {

    public int solution(int[] array) {

        int answer = 0;
        int count = 0;
        for(int i = 0; i<array.length; i++){
            String target = Integer.toString(array[i]);
            char[] charArray = target.toCharArray();

            for(char ch : charArray){
                if(ch == '7'){
                    count++;
                }
            }
            
        }
        answer = count;

        return answer;

    }

}