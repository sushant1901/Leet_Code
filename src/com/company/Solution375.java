class Solution {
    public int backtrack(int[] nums, int mask, int pairsPicked, int[] memo) {
        if (2 * pairsPicked == nums.length) {
            return 0;
        }
        if (memo[mask] != -1) {
            return memo[mask];
        }

        int maxScore = 0;
        for (int firstIndex = 0; firstIndex < nums.length; ++firstIndex) {
            for (int secondIndex = firstIndex + 1; secondIndex < nums.length; ++secondIndex) {
    
                if (((mask >> firstIndex) & 1) == 1 || ((mask >> secondIndex) & 1) == 1) {
                    continue;
                }
                int newMask = mask | (1 << firstIndex) | (1 << secondIndex);
                int currScore = (pairsPicked + 1) * gcd(nums[firstIndex], nums[secondIndex]);
                int remainingScore = backtrack(nums, newMask, pairsPicked + 1, memo);
                maxScore = Math.max(maxScore, currScore + remainingScore);
            }
        }
        memo[mask] = maxScore;
        return maxScore;
    }

    public int maxScore(int[] nums) {
        int memoSize = 1 << nums.length;
        int[] memo = new int[memoSize];
        Arrays.fill(memo, -1);
        return backtrack(nums, 0, 0, memo);
    }
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
