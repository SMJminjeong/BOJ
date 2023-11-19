class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.replaceAll("[^0-9]", "").split("");
        int[] intArr = new int[arr.length];
        int i = 0;
        for (String s : arr){
              intArr[i] = Integer.parseInt(s);
              i++;
        }
        
        for(int num : intArr){
            answer += num;
        }
        
        return answer;
    }
}