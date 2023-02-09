class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] map = new int[26];
        for (int i = 0; i < order.length(); i++) {
            map[order.charAt(i) - 'a'] = i;
        }
        for (int i = 1; i < words.length; i++) {
            String first = words[i - 1];
            String second = words[i];
            int n = Math.min(first.length(), second.length());
            boolean flag = false;
            for (int j = 0; j < n; j++) {
                if (map[first.charAt(j) - 'a'] < map[second.charAt(j) - 'a']) {
                    flag = true;
                    break;
                }
                else if (map[first.charAt(j) - 'a'] > map[second.charAt(j) - 'a']) {
                    return false;
                }
            }
            if (!flag && first.length() > second.length()) {
                return false;
            }
        }
        return true;
    }
}
