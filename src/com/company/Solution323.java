class Solution {
    public int partitionString(String s) {
        int subs = 1;
        Set<Character> charSet = new HashSet<>();
        for(char ch: s.toCharArray()){
            if(!charSet.contains(ch)){
                charSet.add(ch);
                continue;
            }
            subs++;
            charSet.clear();
            charSet.add(ch);
        }
        return subs;
    }
}
