class Solution {
    public long maxRunTime(int n, int[] batteries) {
        Arrays.sort(batteries);
        long extra = 0;
        for (int i = 0; i < batteries.length - n; i++) {
            extra += batteries[i];
        }
        int[] live = Arrays.copyOfRange(batteries, batteries.length - n, batteries.length);

        for (int i = 0; i < n - 1; i++) {
            if (extra < (long)(i + 1) * (live[i + 1] - live[i])) {
                return live[i] + extra / (long)(i + 1);
            }
            extra -= (long)(i + 1) * (live[i + 1] - live[i]);
        }
        return live[n - 1] + extra / n;
    }
}
