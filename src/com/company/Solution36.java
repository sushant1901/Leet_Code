class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m= matrix.length;
        int n=matrix[0].length;
        int ans = 1000000;
        HashMap<String,Integer>memo=new HashMap<String,Integer>();
        for(int currentCol=0;currentCol<n;currentCol++){
            int tempAns=minCost(matrix,0,currentCol,m,n,memo);
            ans=Math.min(ans,tempAns);
        }
        return ans;
    }
    public int minCost( int[][] matrix,int currentRow, int currentCol, int m,int n,HashMap<String,Integer>memo){
        
        if(currentRow < 0 || currentRow >= n || currentCol < 0 || currentCol >= n )
        return 10000;
        
        if(currentRow==n-1){
            return matrix[currentRow][currentCol];
        }
        String currentKey=currentRow+"-"+currentCol;
        
        if(memo.containsKey(currentKey))
            return memo.get(currentKey);
        
        int down = matrix[currentRow][currentCol] + minCost(matrix,currentRow + 1, currentCol,  m,n,memo);
        
        int leftDiag = matrix[currentRow][currentCol] + minCost(matrix,currentRow + 1, currentCol - 1, m,n,memo);
        
        int rightDiag = matrix[currentRow][currentCol] + minCost( matrix,currentRow + 1, currentCol + 1,m,n,memo);
        memo.put(currentKey,Math.min(rightDiag,Math.min(leftDiag,down)));
      
        return Math.min(rightDiag,Math.min(leftDiag,down));
    }
}
