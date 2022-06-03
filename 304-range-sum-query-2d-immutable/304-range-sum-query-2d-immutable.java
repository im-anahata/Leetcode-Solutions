class NumMatrix {

        int[][] numMatrix;
    public NumMatrix(int[][] matrix) {
     int m = matrix.length;
     int n = matrix[0].length;
     numMatrix = new int[m][n];
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n; j++){
                numMatrix[i][j] = matrix[i][j];
            }
        }
        // Updating each  cell such that each cell is equal to sum of all the elements in its previous columns in the same row.
         for(int i = 0 ; i < m ; i++){
            for(int j = 1 ; j < n; j++){
                numMatrix[i][j] += numMatrix[i][j - 1];
            }
        }
		//Updating each  cell such that each cell is equal to sum of all the elements in its previous rows in the same column
         for(int i = 1 ; i < m ; i++){
            for(int j = 0 ; j < n; j++){
                numMatrix[i][j] += numMatrix[i-1][j];
            }
        }
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
	// Brute force to find the sum
      /**  int sum = 0;
        for(int i = row1 ; i <= row2; i++){
            for(int j = col1 ; j <=col2 ; j++){
                sum += numMatrix[i][j];
            }
        }
        return sum; **/
		
    // Optimised Approach
	
    int totalSum = numMatrix[row2][col2];
    int extraElements = (row1 != 0 ? numMatrix[row1 - 1][col2] : 0) + (col1 != 0 ? numMatrix[row2][col1 - 1] : 0) - ((row1 != 0 && col1 != 0 )? numMatrix[row1 - 1][col1 -1] : 0);
           return totalSum - extraElements;
    }
}