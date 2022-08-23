class Solution {
    public void solveSudoku(char[][] board) {
        sudokuSolver(board, 0, 0);
    }
    
    private boolean sudokuSolver(char[][] board, int currentRow, int currentCol){
        if(currentRow == 9){
            return true;
        }
        
        int nextRowPos;
        int nextColPos;
        
        if(currentCol == 8){
            nextRowPos = currentRow + 1;
            nextColPos = 0;
        }
        else{
            nextRowPos = currentRow;
            nextColPos = currentCol + 1;
        }
        
        if(board[currentRow][currentCol] != '.'){
            return sudokuSolver(board, nextRowPos, nextColPos);
        }
        
        for(char currentVal = '1'; currentVal <= '9'; currentVal++){
            if(isValidCell(board, currentRow, currentCol, currentVal)){
                board[currentRow][currentCol] = currentVal;
                
                if(sudokuSolver(board, currentRow, currentCol)){
                    return true;
                }
                
                board[currentRow][currentCol] = '.';
                
            }
        }
        
        return false;
        
    }
    
    private boolean isValidCell(char[][] board, int currentRow, int currentCol, char currentVal){
        return isRowValid(board, currentRow, currentVal) && isColValid(board, currentCol, currentVal) && isSubGridValid(board, currentRow, currentCol, currentVal);
    }
    
    private boolean isRowValid(char[][] board, int currentRow, char currentVal){
        
        for(int currentCol = 0; currentCol < 9; currentCol++){
            if(board[currentRow][currentCol] == currentVal){
                return false;
            }
        }
        
        return true;
        
    }
    
    private boolean isColValid(char[][] board, int currentCol, char currentVal){
        
        for(int currentRow = 0; currentRow < 9; currentRow++){
            if(board[currentRow][currentCol] == currentVal){
                return false;
            }
        }
        
        return true;
        
    }
    
    private boolean isSubGridValid(char[][] board, int currentRow, int currentCol, char currentVal){
        
        int x = 3 * (currentRow/3);
        int y = 3 * (currentCol/3);
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(board[x+i][y+j] == currentVal){
                    return false;
                }
            }
        }
        
        return true;
        
    }
    
}
