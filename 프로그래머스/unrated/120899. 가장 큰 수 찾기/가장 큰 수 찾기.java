import java.util.Arrays;
class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
        
        int target = sortedArray[sortedArray.length -1];
        answer[0] = target;
        
        for(int i = 0; i<array.length; i++){
            if(array[i] == target){
                answer[1] = i;
                break;
            }
        }
        
        return answer;
    }
}