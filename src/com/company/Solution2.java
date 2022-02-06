package com.company;
import java.util.*;
class Solution2 {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i] == 0){
                nums[i]= -1;
            }
        }
        int sum=0,res=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }else{
                int firstIndex = map.get(sum);
                res=Math.max(res,i-firstIndex);
            }
        }
        return res;

    }
}