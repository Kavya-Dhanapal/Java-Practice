class Solution {
    // time:O(n), n = number of rows and cols in a matrix
    //space:O(1)  

    public int kthSmallest(int[][] matrix, int k) {
        
        // 1   3   6       k = 8, smallest = 1, largest = 9
        // 2   4   8       starting point = 6 or 5 could be anything
        // 5   7   9       

        //         i           m           j        
        // range = 1  2  3  4  5  6  7  8  9        <-  mid 5 not possible, move i

        //                        i  m     j        
        // range = 1  2  3  4  5  6  7  8  9        <-  mid 7 not possible, move i

        //                              im j        
        // range = 1  2  3  4  5  6  7  8  9        <-  mid 8 yes possible, so move j

        //                           j  i           
        // range = 1  2  3  4  5  6  7  8  9        loop breaks

        int rows = matrix.length;
        int cols = matrix[0].length;

        int i = matrix[0][0];
        int j = matrix[rows - 1][cols -1];

        int res = -1;
        while(i <= j) {
            int mid = i + (j - i)/2;

            if(isMidSmallest(matrix, k, mid) == true) {
                res = mid;
                j = mid - 1;
            }
            else i = mid + 1;
        } 

        return res;
    }

    public boolean isMidSmallest(int[][] matrix, int k, int mid) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // 1   3   6        <- 6 start point
        // 2   4   8       
        // 5   7   9    

        int row = 0;
        int col = cols - 1;
        int count = 0;

        while(row < rows && col >= 0) {
            if(matrix[row][col] <= mid) {
                count += col + 1;
                row++;          // move down to find more
            }
            else col--;         // go left to find smaller

           if(count >= k) return true;          // for duplicates
        }

        return false;
    }
}