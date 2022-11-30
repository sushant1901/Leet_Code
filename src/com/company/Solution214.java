class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> memo= new HashMap<Integer,Integer>();
        
        for(int num : arr){
            memo.put(num,memo.getOrDefault(num,0)+1);
        }
        
        HashSet<Integer> uniques= new HashSet(memo.values());
        return memo.size()==uniques.size();
    }
}
