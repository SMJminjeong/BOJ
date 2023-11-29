class Solution {

    public int[] solution(String[] keyinput, int[] board) {

        int[] answer = new int[2];
        int[] result = new int[]{0,0};

        int maxX = board[0]/2;
        int maxY = board[1]/2;
            for(String target : keyinput){
                if(target.equals("left")){
                    result[0] = Math.max(result[0]-1, -maxX);
                }
                else if(target.equals("right")){
                    result[0] = Math.min(result[0]+1, maxX);
                }
                else if (target.equals("up")){
                    result[1] = Math.min(result[1]+1, maxY);
                }
                else{
                    result[1] = Math.max(result[1]-1, -maxY);
                }
            }
        System.arraycopy(result, 0, answer, 0, 2); 
        return answer;

    }

}