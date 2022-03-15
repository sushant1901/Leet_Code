package com.company;
import java.util.*;
class Solution3 {
    public int climbStairs(int n) {
        return totalWays(0,n,new HashMap<Integer,Integer>());
    }
    private int totalWays(int currentStair,int targetStair,HashMap<Integer,Integer> memo){
        if(currentStair == targetStair)
            return 1;
        if(currentStair > targetStair)
            return 0;
        int currentKey= currentStair;
        if(memo.containsKey(currentKey))
            return memo.get(currentKey);

        int oneJump = totalWays(currentStair+1,targetStair,memo);
        int twoJumps =totalWays(currentStair+2,targetStair,memo);

        memo.put(currentKey,oneJump + twoJumps);
        return oneJump + twoJumps;
    }
}