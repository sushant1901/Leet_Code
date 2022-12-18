class Solution {
    public int[] dailyTemperatures(int[] T) {
        int n = T.length;
        int[] rst = new int[n];
        Stack<Integer> stack = new Stack<>(); // note: store indexes
        
        for (int i = n - 1; i >= 0; i--) {
            int num = T[i];
            // mono stack
            while (!stack.isEmpty() && num >= T[stack.peek()]) stack.pop();
            // process right-side closest & higer number
            if (!stack.isEmpty() && num < T[stack.peek()]) rst[i] = stack.peek() - i;
            else rst[i] = 0;
            
            // add curr
            stack.push(i);
        }
        
        return rst;
    }
}
