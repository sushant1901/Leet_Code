class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character,Integer> memo= new HashMap<>();
        for( char ch: magazine.toCharArray()){
            if(memo.containsKey(ch)){
                int count=memo.get(ch)+1;
                memo.put(ch,count);
                
            }else{
                memo.put(ch,1);
            }
        }
            
            for(char c: ransomNote.toCharArray()){
                if(memo.containsKey(c)== false) return false;
                
                int count= memo.get(c);
                if(count==0) return false;
                memo.put(c,count-1);
            }
            
            return true;
        
    }
}
