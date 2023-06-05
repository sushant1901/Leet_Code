class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int length=A.length;
        int[] C= new int[length];
        for(int i=0;i<length;i++){
            boolean flag=false;
            for(int j=0;j<B.length;j++){
                if(A[i]==B[j]) {
                    flag=true;
                }
                if(flag && j>=i)
                {
                     C[j]++;
                }
            }
        }

        return C;
    }
}
