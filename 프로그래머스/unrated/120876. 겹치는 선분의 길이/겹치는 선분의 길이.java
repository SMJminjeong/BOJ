class Solution {

    public int solution(int[][] lines) {

        int answer = 0;
        int temp = 0; 
        for(int i = 0; i < lines.length; i++){
            int startLine = lines[i][0];
            int endLine = lines[i][1];
            for(int j = i + 1; j < lines.length; j++){
                int sndStartLine = lines[j][0];
                int sndEndLine = lines[j][1];

                if(startLine == sndStartLine){
                    temp = Math.min(endLine, sndEndLine);
                }
                else if(startLine < sndEndLine){ // 1시작점 < 2끝점
                    temp = sndEndLine - startLine;
                }
                else if(sndStartLine < endLine){ // 2시작점 < 1끝점
                    temp = endLine - sndStartLine;
                }
                System.out.println(temp);
            }
            if(answer < temp){
                answer = temp;
            }
        }

        return answer;

    }

}