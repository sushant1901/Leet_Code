import java.util.HashMap;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        int count = 0;
        for (int n : nums) {
            if (hs.containsKey(n)) {
                int k = hs.get(n);
                count += k;
                hs.put(n, k + 1);
            } else {
                hs.put(n, 1);
            }
        }
        return count;

    }
}
