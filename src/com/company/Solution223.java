public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        String operators = "+-*/";
        for(String token : tokens){
            if(!operators.contains(token)){
                stack.push(Integer.valueOf(token));
                continue;
            }
            int a = stack.pop();
            int b = stack.pop();
            if (token.equals("+")){
                stack.push(b + a);   
            }
            else if(token.equals("-")){
                stack.push(b - a);
            }else if(token.equals("*")){
                stack.push(b * a);
            }else {
                stack.push(b / a);
            }
        }
        return stack.pop();
    }
}
