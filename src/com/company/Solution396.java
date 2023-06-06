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
//TC= O(n^2)


class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) { 
        int comm = 0;
        int[] freq  = new int[51];
        int[] ans = new int[A.length];
        freq[A[0]]++;
        freq[B[0]]++;
        int c = 1;
        if(A[0] == B[0]) comm++;
        ans[0] = comm;
        for(int i = 1; i < A.length; i++)   {    
            if(freq[A[i]] > 0) comm++;  
            if(freq[B[i]] > 0) comm++;
            if(A[i] == B[i]) comm++;
            freq[A[i]]++;
            freq[B[i]]++;
            ans[c]1 = comm;   
            c++;
            
        }
        
        return ans;
        
    }
}

//TC= O(n);
