class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false; 
        int rows = matrix.length;
        int cols = matrix[0].length;
        int row = rows -1;
        int col = 0;
        while(row >= 0 && col < cols) {
           int current_value = matrix[row][col];

           if(current_value == target) {
            return true;
           } else if(current_value < target) {
            col++;
           } else {
            row--;
           }
        }
        return false;
    }
}