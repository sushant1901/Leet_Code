class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>answer=new ArrayList<>();
        findAllCombs(0,0,"",n,answer);
        return answer;
    }
    private void findAllCombs(int openCount,int closedCount,String expression,int n, List<String>answer){
        if(openCount== closedCount && openCount==n){
            answer.add(expression);
            return;
        }
        
        if(openCount<n){
            findAllCombs(openCount+1,closedCount,expression+"(",n,answer);
        }
        
        if(openCount > closedCount){
            findAllCombs(openCount,closedCount+1,expression+")",n,answer);
        }
        
        return;
    }
}
