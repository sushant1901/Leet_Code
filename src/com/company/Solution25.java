class Solution {
    public int deleteAndEarn(int[] nums) {
        Arrays.sort(nums);
        int n=10001;
        int [] values=new int[n];
        int maxValue=-1;
        for(int num: nums){
            values[num]+=1;
            maxValue = Math.max(maxValue,num);
        }
        return maxPoints(values,0,new HashMap<Integer,Integer>());
        
    }
    private int maxPoints(int[] values,int currentIndex,HashMap<Integer,Integer>memo){
        if(currentIndex>= values.length) return 0;
        
        int currentKey=currentIndex;
        if(memo.containsKey(currentIndex))
            return memo.get(currentIndex);
        
        int del=currentIndex*values[currentIndex]+maxPoints(values,currentIndex+2,memo);
        int notDel=maxPoints(values,currentIndex+1,memo);
        
        memo.put(currentKey,Math.max(del,notDel));
        return Math.max(del,notDel);
    }
}
