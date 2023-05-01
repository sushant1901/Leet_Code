class Solution {
    public double average(int[] salaries) {
        int minSalary = Integer.MAX_VALUE;
        int maxSalary = Integer.MIN_VALUE;
        int sum = 0;

        for (int salary : salaries) {
            sum += salary;
            minSalary = Math.min(minSalary, salary);
            maxSalary = Math.max(maxSalary, salary);
        }
        return (double)(sum - minSalary - maxSalary) / (double)(salaries.length - 2);
    }
}
