class Solution {

    public String solution(String polynomial) {

        String answer = "";
        StringBuilder sb = new StringBuilder();
        String[] polyArray = polynomial.split("\\s*\\+\\s*");

        int sumX = 0;
        int sumNum = 0;

        for(String target : polyArray){
            if(target.equals("x")){
                sumX += 1;
            }
            else if(target.contains("x")){
                String[] numX = target.split("x");
                if (numX.length > 0) { // x가 포함된 경우
                    sumX += Integer.parseInt(numX[0]);
                }
            } else {
                sumNum += Integer.parseInt(target);
            }
        }

         if (sumX != 0) {
            if (sumX == 1) {
                sb.append("x");
            } else {
                sb.append(sumX).append("x");
            }

            if (sumNum != 0) {
                sb.append(" + ");
                sb.append(sumNum);
            }
            answer = sb.toString();
        } else if (sumNum != 0) {
            sb.append(sumNum);
            answer = sb.toString();
        }

        return answer;

    }

}