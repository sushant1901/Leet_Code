class Solution {
        public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int ans = 0; 
        for (int hi = people.length - 1, lo = 0; hi >= lo; --hi, ++ans) {
            if (people[lo] + people[hi] <= limit) {
                ++lo; 
            }
        }
        return ans;
    }
}
