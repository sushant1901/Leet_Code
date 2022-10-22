class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer= new ArrayList<>();
        if(numRows==0) return answer;
        
        answer.add(new ArrayList<>());
        answer.get(0).add(1);
        for(int i=1;i<numRows;i++){
            List<Integer> curr= new ArrayList<>();
            curr.add(1);
            for(int j=1;j<i;j++){
                curr.add(answer.get(i-1).get(j-1) + answer.get(i-1).get(j));
            }
            curr.add(1);
            answer.add(curr);
        }
        return answer;
    }
}
