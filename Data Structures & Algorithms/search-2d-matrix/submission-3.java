class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROWS = matrix.length;
        int COLS = matrix[0].length;
        // find the correct row
        int top = 0, bottom = ROWS-1;
        while(top <= bottom){
            // see if in top
            int midRow = (top + bottom)/2;
            if(target > matrix[midRow][COLS-1]){
                top = midRow + 1;
            }else if(target < matrix[midRow][0]){
                bottom = midRow - 1;
            }else{
                break;
            }
        }
        if(top > bottom) return false;
        int row = (top + bottom) / 2;
        int l = 0, r = COLS - 1;
        while (l <= r){
            int m = (l + r) / 2;
            if(matrix[row][m] == target){
                return true;
            }else if(matrix[row][m] < target){
                l = m + 1;
            }else{ // matrix[row][m] > target
                r = m - 1;
            }
        }
        return false;


    }
}
