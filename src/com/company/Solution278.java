class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
        int start=1;
        int end=x;
        int answer=-1;
        while(start <= end){
            int mid=start+(end-start)/2;
            
            if(mid == x/mid) return mid;
            
            if(mid > x/mid) end=mid-1;
            else {
                answer=mid;
                start=mid+1;
            }
        }
        return answer;
    }
}
