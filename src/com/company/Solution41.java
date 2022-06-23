class Solution {
    public int minDistance(String s1, String s2) {
        return minOps(s1,s2,0,0,s1.length(),s2.length(),new HashMap<String,Integer>());
        
    }
    private int minOps(String s1,String s2,int i,int j,int m,int n,HashMap<String,Integer>memo){
        if(j>=n) 
            return m-i;
        if(i>=m) 
            return n-j;
        String currentKey=i+"-"+j;
        if(memo.containsKey(currentKey))
            return memo.get(currentKey);
        
        int ans=100000;
        
        if(s1.charAt(i) == s2.charAt(j)){
            ans=minOps(s1,s2,i+1,j+1,m,n,memo);
        }else{
            int insertion=1+minOps(s1,s2,i,j+1,m,n,memo);
            int deletion=1+minOps(s1,s2,i+1,j,m,n,memo);
            int replace =1+minOps(s1,s2,i+1,j+1,m,n,memo);
            ans=Math.min(insertion,Math.min(deletion,replace));
            
        }
        memo.put(currentKey,ans);
        return ans;
    }
}
