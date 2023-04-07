class Solution {
    public int subarraySum(int[] nums, int k) {
        int answer=0;
        int prefixSum=0;

        HashMap<Integer,Integer> memo= new HashMap<>();
        memo.put(prefixSum,1);

        for(int currentVal:nums){
            prefixSum+=currentVal;

            if(memo.containsKey(prefixSum-k)) answer+=memo.get(prefixSum-k);

            if(memo.containsKey(prefixSum)) memo.put(prefixSum,memo.get(prefixSum)+1);
            else memo.put(prefixSum,1);
        }

        return answer;
    }
}
