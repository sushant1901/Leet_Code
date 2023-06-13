class Solution {
       public String removeKdigits(String num, int k) {
        int digitsToRemove = k;
        Stack<Character> stack = new Stack<>();
        if(k>=num.length()) return "0";
        for (char digit : num.toCharArray()) {
            while (!stack.isEmpty() && digitsToRemove > 0 && digit < stack.peek()) {
                stack.pop();
                digitsToRemove--;
            }
            stack.push(digit);
        }
        while (digitsToRemove > 0 && !stack.isEmpty()) {
            stack.pop();
            digitsToRemove--;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }
}
