class Solution {

    public int solution(int[][] board) {

        int answer = 0;

        int [][] newBoard =  new int [board.length][board[0].length];

        for(int i=0; i<board.length; i++){
            for(int j = 0; j<board[i].length; j++){
                if(board[i][j] == 1){
                    dangerArea(i, j, newBoard);
                }
            }
        }

        answer = countDanger(newBoard);

        return answer;

    }

    void dangerArea (int i, int j, int[][] newBoard){
        int X = newBoard.length;
        int Y = newBoard[0].length;

        newBoard[i][j] = 1;
        if(i > 0){ // 위쪽
            newBoard[i-1][j] = 1;
        }
        if(i < X-1){ // 아래쪽
            newBoard[i+1][j] = 1;
        }
        if(j > 0){ // 왼쪽
            newBoard[i][j-1] = 1;
        }
        if(j < Y-1){
            newBoard[i][j+1] = 1;
        }
        if(i > 0 && j > 0){ // 위쪽 왼쪽 대각선 
            newBoard[i-1][j-1] = 1;
        }
        if(i < X-1 && j > 0){
            newBoard[i+1][j-1] = 1; // 아래쪽 왼쪽 대각선
        }
        if( i > 0 && j < Y-1 ){
            newBoard[i-1][j+1] = 1; // 위쪽 오른쪽 대각선
        }
        if(i < X-1 && j < Y-1){
            newBoard[i+1][j+1] = 1; // 아래쪽 오른쪽 대각선
        }
    }


    int countDanger(int[][] board){
        int count =0 ;
            for(int i=0 ; i< board.length; i++){

                for(int j=0 ; j< board[i].length; j++){

                    if(board[i][j]==0){
                            count++;
                    }            
                }
            }

            return count;
    }
}