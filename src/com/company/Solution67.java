class Solution {
    public int numJewelsInStones(String J, String S) {
        int res=0;
        for(char j:J.toCharArray()){
            for(char s:S.toCharArray()){
                if(s==j) res++;
            }
        }
        return res;
    }
}
