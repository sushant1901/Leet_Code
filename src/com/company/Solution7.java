package com.company;
import java.util.*;
class Solution7 {
    public boolean canJump(int[] nums) {
        return isPossible(nums,0,new HashMap<Integer,Boolean>());
    }

    private boolean isPossible(int[] nums, int currentIndex,HashMap<Integer,Boolean> memo){
        if(currentIndex >=nums.length-1)
            return true;
        int currentKey=currentIndex;
        if(memo.containsKey(currentKey)){
            return memo.get(currentKey);
        }

        
        int currentJumps= nums[currentIndex];
        boolean ans =false;

        for(int x=1;x<= currentJumps;x++){
            if(isPossible(nums,currentIndex + x,memo)){
                memo.put(currentIndex,true);
                //ans= ans|| tempAns;
                return true;
            }

        }
        memo.put(currentKey,ans);

        return ans;


    }




}
