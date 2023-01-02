class Solution {
    private boolean helper(String s){
        int uc=0,lc=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)) uc++;
            else lc++;
        }
        int n = s.length();
        if(uc == n || lc == n || (uc == 1 && Character.isUpperCase(s.charAt(0))))
            return true;
        else return false;
    }
    public boolean detectCapitalUse(String word) {
        return helper(word);
    }
}
