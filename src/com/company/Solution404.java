class Solution {
    public boolean divisorGame(int n) {
        HashMap<Integer,Boolean> memo= new HashMap<>();
         return whoWinner(n,memo);
    }

    private boolean  whoWinner(int n,HashMap<Integer,Boolean> memo){
        if(n==1) return false;

        if(memo.containsKey(n)) return memo.get(n);

        for(int x=1; x<n;x++){
            if(n%x==0){
                if(!whoWinner(n-x,memo)){
                    memo.put(n,true);
                    return true;
                }

            }
        }

        memo.put(n,false);
        return false;
    }
}
