/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        
        // add in stack
        Stack<ListNode> stack1 = new Stack();
        Stack<ListNode> stack2 = new Stack();
        while(curr1 != null || curr2 != null){
            if(curr1 != null){
                stack1.push(curr1);
                curr1 = curr1.next;
            }
            
            if(curr2 != null){
                stack2.push(curr2);
                curr2 = curr2.next;
            }
        }
        
        return addTwoNumbers(stack1, stack2);
    }
    
    private ListNode  addTwoNumbers(Stack<ListNode> stack1, Stack<ListNode> stack2){
        ListNode dummyNode = new ListNode();
        ListNode head = dummyNode;
        
        int carry = 0;
        while(!stack1.empty() || !stack2.empty()){
            
            int sum = carry;
            
            if(!stack1.empty()){
                sum += stack1.pop().val;
            }
            
            if(!stack2.empty()){
                sum += stack2.pop().val;
            }
            
            
            ListNode newNode = new ListNode(sum % 10);
            newNode.next = head.next;
            head.next = newNode;
            
            carry = sum / 10;
        }
        
        if(carry == 1){
            ListNode newNode = new ListNode(1);
            newNode.next = head.next;
            head.next = newNode;
        }
        
        return head.next;
    }
}
