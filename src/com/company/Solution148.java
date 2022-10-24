class Solution {
    int max = 0;
    public int maxLength(List<String> arr) {
        dfs(0, arr, "");
        return max;
    }
    
    public void dfs(int start, List<String> arr, String str){
        if(!isUnique(str)){
            return;
        }
        max = Math.max(max, str.length());
        
        for(int i=start; i<arr.size();i++){
            String s = arr.get(i);
            dfs(i+1, arr, str + s);
        }
    }
    
    public static boolean isUnique(String s){
        Set<Character> set = new HashSet<Character>();
        
        for(char ch: s.toCharArray()){
            if(set.contains(ch)){
                return false;
            }
            set.add(ch);
        }
        return true;
    }
}
