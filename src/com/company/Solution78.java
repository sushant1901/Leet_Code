class Solution {
    public int firstUniqChar(String s) {
        for(char c : s.toCharArray()){
            int index = s.indexOf(c);
            int lastIndex = s.lastIndexOf(c);
            if(index == lastIndex)
                return index;
        }
        return -1;
    }
} 
