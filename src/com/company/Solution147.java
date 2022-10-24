class Solution {
    public boolean isAnagram(String s, String t) {
        if(s==null && t== null)  return true;
        else if(s==null || t==null) return false;
        else if(s.length()!=t.length()) return false;
        
        HashMap<Character,Integer> memo= new HashMap<>();
        for( char c: s.toCharArray()){
            memo.put(c,memo.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            int count=memo.getOrDefault(c,0);
            if(count==0) return false;
            else memo.put(c,count-1);
        }
        
        return true;
    }
}
