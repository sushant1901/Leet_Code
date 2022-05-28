class Solution {
    public int tribonacci(int n) {
        return nthTribo(n,new HashMap<Integer,Integer>());
        
    }
    private int nthTribo(int n,HashMap<Integer,Integer>memo){
        if(n==0)return 0;
        if(n==1)return 1;
        if(n==2)return 1;
        
        int currentkey=n;
        if(memo.containsKey(n)) return memo.get(n);
        
       
         int one=nthTribo(n-1,memo);
         int two=nthTribo(n-2,memo); 
         int three=nthTribo(n-3,memo);
        
         memo.put(currentkey,one+two+three);
        return one+two+three;
    }
}
