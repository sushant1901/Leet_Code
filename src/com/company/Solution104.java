class Solution {
    public String reverseStr(String s, int k) {
        char[] ca= s.toCharArray();
        for(int i=0;i<ca.length;i=i+(2*k)){
            int start=i;
            int end=Math.min(i+k,s.length())-1;
            char temp;
            while(start<end){
                temp=ca[start];
                ca[start]=ca[end];
                ca[end]=temp;
                
                start++;
                end--;
            }
        }
        return new String(ca);
    }
}
