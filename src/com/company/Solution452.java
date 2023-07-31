class Solution {
    Map<Pair<Integer, Integer>, Integer> savedResult = new HashMap<>();
        
    public int minimumDeleteSum(String s1, String s2) {
        
        return computeCost(s1, s2, s1.length()-1, s2.length()-1);
    }

    private int computeCost(String s1, String s2, int i, int j) {
        if (i < 0 && j < 0) {
            return 0;
        }
        Pair<Integer, Integer> key = new Pair<>(i, j);
        if (savedResult.containsKey(key)) {
            return savedResult.get(key);
        }
        
        if (i < 0) {
            savedResult.put(key, s2.charAt(j) + computeCost(s1, s2, i, j-1));
            return savedResult.get(key);
        }
        if (j < 0) {
            savedResult.put(key, s1.charAt(i) + computeCost(s1, s2, i-1, j));
            return savedResult.get(key);
        }
        if (s1.charAt(i) == s2.charAt(j)) {
            savedResult.put(key, computeCost(s1, s2, i-1, j-1));
        } else {
            savedResult.put(key, Math.min(
                s1.charAt(i) + computeCost(s1, s2, i-1, j),
                s2.charAt(j) + computeCost(s1, s2, i, j-1)
            ));
        }
        return savedResult.get(key);
    }
}
