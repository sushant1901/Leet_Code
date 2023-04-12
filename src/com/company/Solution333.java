class Solution {
    public int hIndex(int[] citations) {
        int l=0, h=citations.length-1;
        int n=h+1;
        int ans=-1;
        while(l<=h) {
            int m = l+((h-l)/2);
            if(citations[m]>=n-m) {
                ans = n-m;
                h = m-1;
            }
            else
                l = m+1;
        }
        return ans==-1?0:ans;
    }
}
