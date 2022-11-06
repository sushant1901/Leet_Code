class Solution {
    
    public String orderlyQueue(String S, int K) {
        
        int len=S.length();
        
        if(len==0)return S;
        
        // Double S
        S=S+S;
        char[]cs=S.toCharArray();
        
        if(K>=2){
            int[]cnt=new int[26];
            for(int i=0;i<len;i++)cnt[cs[i]-'a']++;
            StringBuilder str=new StringBuilder(len);
            for(int i=0;i<26;i++){
                int n=cnt[i];
                for(int j=0;j<n;j++)str.append((char)(i+'a'));
            }
            return str.toString();
        }
        
        
        // Now K==1
        char[] res=new char[len*2];
        res[0]=cs[0];
        int[] arr=new int[len*2];//prefix function
        arr[0]=-1;
        
        int x=0;
        
        for(int i=1;i<len*2;i++){
            while(x>=0&&res[arr[x]+1]>cs[i])x=arr[x];
            res[x+1]=cs[i];
            
            //update arr
            if(x>=0){
                int k=arr[x];
                while(k>=0&&res[k+1]!=cs[i])k=arr[k];
                if(res[k+1]==cs[i])k++;
                arr[x+1]=k;
            }
            
            x++;
        }
        
        return new String(res,0,len);
    }
}
