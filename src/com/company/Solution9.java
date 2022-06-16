class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        return totalWays(0,0,obstacleGrid.length,obstacleGrid[0].length,obstacleGrid,new HashMap<String,Integer>());
        
    }
    private int totalWays(int currentRow,int currentCol,int m,int n,int[][]obstacleGrid ,HashMap<String,Integer>memo){
        if(currentRow >=m || currentCol >=n || obstacleGrid[currentRow][currentCol]==1)
            return 0;
        if(currentRow ==m-1 && currentCol==n-1)
            return 1;
        String currentKey=currentRow+"-"+currentCol;
        if(memo.containsKey(currentKey))
            return memo.get(currentKey);
        
        
        
        int rightMove=totalWays(currentRow,currentCol+1,m,n,obstacleGrid,memo);
        int downMove=totalWays(currentRow+1,currentCol,m,n,obstacleGrid,memo);
        memo.put(currentKey,rightMove+downMove);
        
        return rightMove+downMove;
        
    }
}
