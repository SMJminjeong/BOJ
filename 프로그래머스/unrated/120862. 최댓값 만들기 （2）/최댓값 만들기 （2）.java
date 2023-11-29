import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);
        int res1 = numbers[0] * numbers[1];
        int res2 = numbers[numbers.length - 1] * numbers[numbers.length - 2];

        answer = res1 > res2 ? res1 : res2;
        return answer;
    }
}