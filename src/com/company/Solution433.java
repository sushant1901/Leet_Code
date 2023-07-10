class Solution {
    public int findComplement(int num) {
       String str = Integer.toBinaryString(num);
        
       for(int i = 0; i< str.length() ; i++){
           num = toggleBit(num, i);
       }
       return num;
    }
    public static int toggleBit(int num, int pos){
        return num ^ (1 << pos);
    }
}
