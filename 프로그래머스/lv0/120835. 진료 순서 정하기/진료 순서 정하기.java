import java.util.Arrays;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] copyEmer = Arrays.copyOf(emergency, emergency.length);
        
        Arrays.sort(copyEmer);
        System.out.println(copyEmer);
        
        for(int i = 0; i<emergency.length; i++){
            for(int j = 0; j<copyEmer.length; j++){
                if(emergency[i] == copyEmer[j]){
                    answer[i] = emergency.length -j;
                }
            }
        }
        return answer;
    }
}