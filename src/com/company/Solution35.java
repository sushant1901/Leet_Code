class Solution {
    public int numTrees(int n) {
        return nthCatalan(n,new HashMap<Integer, Integer>());
    }
    public Integer nthCatalan(int n, HashMap<Integer, Integer> memo){
        if(n <= 1){
            return 1;
        }
        
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        
        int num = 0;
        
        for(int i = 0; i < n; i++){
            num += nthCatalan(i, memo) * nthCatalan(n -i -1, memo);
        }
        
        memo.put(n, num);
        return memo.get(n);
    }
}
