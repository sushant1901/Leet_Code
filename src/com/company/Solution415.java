// Brute force
class Solution {
    public int longestArithSeqLength(int[] nums) {
        int n= nums.length;
        if(n<=2) return n;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                ans= Math.max(ans,2+solveSeries(i,nums[j]-nums[i],nums));
            }
        }
        return ans;
    }

    private int solveSeries(int i,int diff,int[] nums){
        if(i<0) return 0;

        int ans=0;
        for(int j=i-1;j>=0;j--){
            if(nums[i]-nums[j]==diff){
                ans=Math.max(ans,1+solveSeries(j,diff,nums));
            }
        }
        return ans;
    }
}

//Dynamic Programming
class Solution {
    public int longestArithSeqLength(int[] nums) {
        int maxLength = 0;
        HashMap<Integer, Integer>[] dp = new HashMap[nums.length];
        for (int right = 0; right < nums.length; ++right) {
            dp[right] = new HashMap<>();
            for (int left = 0; left < right; ++left) {
                int diff = nums[left] - nums[right];
                dp[right].put(diff, dp[left].getOrDefault(diff, 1) + 1);
                maxLength = Math.max(maxLength, dp[right].get(diff));
            }
        }
        return maxLength;
    }
}
