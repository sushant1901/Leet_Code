class Solution {
    public double average(int[] salary) {
        int minSalary=Integer.MAX_VALUE;
        int maxSalary=Integer.MIN_VALUE;
        
        for(int i=0;i<=salary.length-1;i++){
            minSalary=Math.min(minSalary,salary[i]);
            maxSalary=Math.max(maxSalary,salary[i]);
        }
        double sum=0;
        for(int i=0;i<salary.length;i++){
            if(minSalary!=salary[i] && maxSalary!=salary[i]){
                sum += salary[i];
            }
        }
        return sum/(salary.length-2);
        
    }
}
