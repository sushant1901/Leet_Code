class Solution {
    int answer = 0;
    public int totalNQueens(int n) {
        char[][] grid = new char[n][n];
        
        for(int currentRow = 0; currentRow < n; currentRow++){
            for(int currentCol = 0; currentCol < n; currentCol++){
                grid[currentRow][currentCol] = '.';
            }
        }
        
        int result[] = {0};
        
        nQueens(grid, 0, n, result);
        
        return result[0];
        
    }
    
    private void nQueens(char[][] grid, int currentRow, int n, int result[]){
        if(currentRow >= n){
            result[0]++;
            return;
        }
        
        for(int currentCol = 0; currentCol < n; currentCol++){
            if(isValid(grid, currentRow, currentCol, n)){
                grid[currentRow][currentCol] = 'Q';
                nQueens(grid, currentRow + 1, n, result);
                grid[currentRow][currentCol] = '.';
            }
        }
        
    }
    
    
    private boolean isValid(char[][] grid, int currentRow, int currentCol, int n){
        return isRowValid(grid, currentRow, n) && isColValid(grid, currentCol, n) && areDiagonalsValid(grid, currentRow, currentCol, n);
    }
    
    private boolean isRowValid(char[][] grid, int currentRow, int n){
        
        for(int j=0; j < n; j++){
            if(grid[currentRow][j] == 'Q'){
                return false;
            }
        }
        
        return true;
        
    }
    
    private boolean isColValid(char[][] grid, int currentCol, int n){
        
        for(int i=0; i < n; i++){
            if(grid[i][currentCol] == 'Q'){
                return false;
            }
        }
        
        return true;
        
    }
    
    private boolean areDiagonalsValid(char[][] grid, int currentRow, int currentCol, int n){
        
        int i = currentRow;
        int j = currentCol;
        
        while(i >= 0 && j >= 0){
            if(grid[i][j] == 'Q'){
                return false;
            }
            i -= 1;
            j -= 1;
        }
        
        
        i = currentRow;
        j = currentCol;
        
        while(i >= 0 && j < n){
            if(grid[i][j] == 'Q'){
                return false;
            }
            i -= 1;
            j += 1;
        }
        
        i = currentRow;
        j = currentCol;
        
        while(i < n && j < n){
            if(grid[i][j] == 'Q'){
                return false;
            }
            i += 1;
            j += 1;
        }
        
        i = currentRow;
        j = currentCol;
        
        while(i < n && j >= 0){
            if(grid[i][j] == 'Q'){
                return false;
            }
            i += 1;
            j -= 1;
        }
        
        return true;
        
    }
    
    
}
