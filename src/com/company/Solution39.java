class Solution {
    public int minCut(String s) {
        return minimumCut(s,0,s.length()-1,new HashMap<String,Integer>());
        
    }
    private int minimumCut(String s,int start,int end,HashMap<String,Integer>memo){
        if(isPalindrome(s,start,end))
            return 0;
        int ans=1000000000;
        String currentKey=start+"-"+end;
        if(memo.containsKey(currentKey)){
            return memo.get(currentKey);
            
        }
        
        for(int i=start;i<end;i++){
            if(isPalindrome(s,start,i)){
                int tempAns=1+minimumCut(s,i+1,end,memo);
                ans=Math.min(ans,tempAns);
            }    
        }
        memo.put(currentKey,ans);
        return ans;  
    }
    private boolean isPalindrome(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)) return false;
            start +=1;
            end -=1;
        }
        return true;
    }
}
