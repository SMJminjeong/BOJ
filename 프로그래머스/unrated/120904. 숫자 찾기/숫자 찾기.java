import java.util.ArrayList;

class Solution {

    public int solution(int num, int k) {

        int answer = 0;
        String numString = String.valueOf(num);
        ArrayList<Integer> kIndexes = new ArrayList<>();

        for (int i = 0; i < numString.length(); i++) {
            if (numString.charAt(i) == (char) (k + '0')) {
                kIndexes.add(i + 1);
            }
        }

        if (!kIndexes.isEmpty()) {
            answer = kIndexes.get(0);
        } else {
            answer = -1;
        }

        return answer;
    }
}