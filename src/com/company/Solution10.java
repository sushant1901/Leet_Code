package com.company;
import java.util.*;
class Solution10 {
    public int uniquePaths(int m, int n) {
        return totalWays(0, 0,m - 1,n - 1,new HashMap<String,Integer>());
    }
    public int totalWays(int down, int right, int m, int n, HashMap<String,Integer> memo)
    {
        if(down==m && right==n)
            return 1;
        if(down > m || right > n)
            return 0;

        String currentKey = Integer.toString(down) + "_" + Integer.toString(right);

        if(memo.containsKey(currentKey))
            return memo.get(currentKey);

        int downWay = totalWays(down+1, right, m, n, memo);

        int rightWay = totalWays(down, right + 1, m, n, memo);

        memo.put(currentKey,(downWay + rightWay));

        return memo.get(currentKey);
    }
}