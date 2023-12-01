import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        int max = sides[1];
        int min = sides[0];

        int low_range = max - min;
        int high_range = max + min;

        answer = high_range - low_range - 1;
        return answer;
    }
}