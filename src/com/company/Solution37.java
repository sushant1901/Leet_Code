class Solution {
    public int maximalSquare(char[][] matrix) {
        int area = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] memo = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]=='1'){
                    int side = maxLength(matrix, i, j, m, n, memo);
                    area = Math.max(area,side*side);
                }
            }
        }
        return area;
    }
    public int maxLength(char[][] matrix,int currentRow, int currentCol, int m, int n, int[][] memo){
        if(currentRow < 0 || currentRow >=m || currentCol < 0 || currentCol >= n || matrix[currentRow][currentCol]=='0'){
            return 0;
        }
        
        if(memo[currentRow][currentCol]!=0)
            return memo[currentRow][currentCol];
        int rightMove = 1 + maxLength(matrix, currentRow, currentCol + 1, m, n, memo);
        
        int downMove = 1 + maxLength(matrix, currentRow + 1, currentCol, m, n, memo);
        
        int drMove = 1 + maxLength(matrix, currentRow + 1, currentCol + 1, m, n, memo);
        
        memo[currentRow][currentCol] = Math.min(rightMove, Math.min(downMove,drMove));
        return memo[currentRow][currentCol];
    }
}
