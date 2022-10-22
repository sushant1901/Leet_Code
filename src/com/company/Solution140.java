class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer>answer= new ArrayList<>();
        HashMap<Integer,Integer> memo1= new HashMap<>();
        HashMap<Integer,Integer> memo2= new HashMap<>();
        
        // desiging a frequency map.
        for(int i=0;i<nums1.length;i++){
            if(memo1.containsKey(nums1[i])) 
                memo1.put(nums1[i],memo1.get(nums1[i])+1);
            else
                memo1.put(nums1[i],1);
        }
        
        for(int i=0;i<nums2.length;i++){
            if(memo2.containsKey(nums2[i]))
                memo2.put(nums2[i],memo2.get(nums2[i])+1);
            else
                memo2.put(nums2[i],1);
        }
        
        // iterating over hashMap.
        
        for(Integer key:memo1.keySet()){
            if(memo2.containsKey(key)){
                int x=Math.min(memo1.get(key),memo2.get(key));
                while(x-->0){
                    answer.add(key);
                }
            }
        }
        
        int[] result= new int[answer.size()];
        for(int i=0;i<answer.size();i++){
            result[i]=answer.get(i);
        }
        return result;
    }
}
