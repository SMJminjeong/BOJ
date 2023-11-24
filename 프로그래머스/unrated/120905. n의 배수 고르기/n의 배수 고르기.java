import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> result = new ArrayList<>();

        // 배열을 순회하면서 n의 배수인지 확인
        for (int i = 0; i < numlist.length; i++) {
            int target = numlist[i];
            if (target % n == 0) {
                result.add(target);
            }
        }

        // ArrayList를 int 배열로 변환
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}