class Solution {
    public int bagOfTokensScore(int[] tokens, int p) {
        Arrays.sort(tokens);
        int left=0,right=tokens.length-1;
        int score=0;
        while(left<=right){
            if(p>=tokens[left]){
                p-=tokens[left++];
                score++;
            }else{
                if(p+tokens[right]>=tokens[left] && score!=0 && right!=left){
                    p+=tokens[right--];
                    score--;
                }else break;
            }
        }
        return score;
    }
}
