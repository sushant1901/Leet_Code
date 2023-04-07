class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int answer=0;
        int prefixSum=0;
        HashMap<Integer,Integer> memo= new HashMap<>();
        memo.put(prefixSum,1);

        for(int currentVal: nums){
            prefixSum+=currentVal;
            int currentRem=((prefixSum%k)+k)%k;

            if(memo.containsKey(currentRem)){
                answer+=memo.get(currentRem);
                memo.put(currentRem,memo.get(currentRem)+1);
            }else{
                memo.put(currentRem,1);
            }

        }
        return answer;
    }
}
