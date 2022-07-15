class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] memo=new int[k];
        for(int currentVal:arr){
            int currentRem=((currentVal % k)+k)%k;
            memo[currentRem] +=1;
        }
        for(int i=0;i<=k/2;i++){
            if(i==0){
                if(memo[i]%2 !=0){
                    return false;
                }
            }else{
                int y=k-i;
                if(memo[i] !=memo[y])
                    return false;
                
            }
        }
        return true;
        
    }
}
