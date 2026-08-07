class Solution {
    public int[][] transpose(int[][] matrix) {
       
        int col=matrix.length;
         int row=matrix[0].length;
       int c[][]=new int[row][col];
       for(int i=0;i<col;i++){
        for(int j=0;j<row;j++){
        c[j][i]=matrix[i][j];
       }
       } 
       return c;
    }
}