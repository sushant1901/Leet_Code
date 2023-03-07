/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int firstBad=-1;
        int start=0;
        int end=n;
        while(start <= end){
            int mid= start+(end-start)/2;
            
            if(isBadVersion(mid)){
                firstBad=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return firstBad;
    }
}
