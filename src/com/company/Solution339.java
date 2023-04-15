class Solution {
    public String decodeMessage(String key, String message) {

        HashMap<Character, Character> hmap = new HashMap<>();

        int i = 0;
        for(char c:key.toCharArray())
            if(c != ' ' && !hmap.containsKey(c))
                hmap.put(c, (char)((i++) +97));
        

        String ans = "";
        for(char c:message.toCharArray())
        {
            if(c != ' ')
                ans += hmap.get(c);
            else
                ans += " ";
        }
        
        return ans;
    }
}
