package com.company;
import java.util.*;
class Solution8 {
    public int jump(int[] nums) {
        return minJumps(nums,0, new HashMap<Integer,Integer>());

    }
    private int minJumps(int[] nums,int currentIndex,HashMap<Integer,Integer> memo){
        if(currentIndex >= nums.length -1){
            return 0;

        }
        if(nums[currentIndex]== 0){
            return 100001;
        }
        int currentKey=currentIndex;
        if(memo.containsKey(currentKey))
            return memo.get(currentKey);

        int currentJumps =nums[currentIndex];
        int ans=100001;
        for(int x=1;x<=currentIndex;x++){
            int tempAns =1+minJumps(nums,currentIndex+x,memo);
            ans =Math.min(ans,tempAns);
        }
        memo.put(currentKey,ans);
        return ans;
    }
}