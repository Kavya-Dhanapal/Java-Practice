class Solution {
    public boolean isValidSudoku(char[][] board) {
       HashSet<String> S =new HashSet<>();
       for( int i=0;i<9;i++){
        for ( int j=0;j<9;j++){
            char c =board[i][j];
            if(c!='.'){
                if((!S.add(c+"in row"+i))||(!S.add(c+"in column"+j))||
                (!S.add(c+"in box"+(i/3)+"-"+(j/3))))
                return false;
            }

        }
       } 
       return true; 
    }
}