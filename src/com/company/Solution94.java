class Solution {
    public boolean isHappy(int n) {
        List<Integer> list= new ArrayList<>();
        while(n!=1){
            int temp=n;
            n=0;
            while(temp>0){
                n=n+(int)Math.pow((temp%10),2);
                temp=temp/10;
                
            }
            if(list.contains(n))
                return false;
            else list.add(n);
        }
        return true;
    }
}
