class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Boolean> memo=new HashMap<Integer,Boolean>();
        for(int currentNum:nums1){
            if(!memo.containsKey(currentNum))
                memo.put(currentNum,true);
        }
        ArrayList<Integer> answer=new ArrayList<>();
        for(int currentNum:nums2){
            if(memo.containsKey(currentNum) && memo.get(currentNum)){
                answer.add(currentNum);
                memo.put(currentNum,false);
            }
        }
        
       int[] result= new int[answer.size()];
        for(int i=0;i<answer.size();i++){
            result[i]=answer.get(i);
        }
        return result;
        
    }
}
