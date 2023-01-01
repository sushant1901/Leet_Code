class Solution {
    public boolean wordPattern(String pattern, String str) {
    char[] chars = pattern.toCharArray();
    String[] strs = str.split(" ");
    if (chars.length != strs.length) return false;
    Map<Character, Integer> cmap = new HashMap<>();
    Map<String, Integer> smap = new HashMap<>();
    for (Integer i = 0; i < chars.length; i++) {
        if (cmap.put(chars[i], i) != smap.put(strs[i], i)) return false;
    }
    return true;
    }
}
