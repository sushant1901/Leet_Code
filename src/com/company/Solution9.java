package com.company;
import java.util.HashMap;
class Solution9 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        return totalWays(0,0,obstacleGrid.length,obstacleGrid[0].length,obstacleGrid,new HashMap<String ,Integer>() );
    }

    private int totalWays(int row,int col,int m,int n,int[][]obstacleGrid,HashMap<String,Integer> memo){
        if(row== m-1 && col==n-1 && obstacleGrid[row][col] !=1 )
            return 1;
        if(row>= m || col >=n || obstacleGrid[row][col]==1)
            return 0;
        String  currentKey = row+"-"+col;
        if(memo.containsKey(currentKey))
            return memo.get(currentKey);
        int rightMove =totalWays(row,col+1,m,n,obstacleGrid,memo);
        int downMove =totalWays(row+1,col,m,n,obstacleGrid,memo);

        memo.put(currentKey,rightMove+downMove);
        return rightMove+downMove;

    }
}