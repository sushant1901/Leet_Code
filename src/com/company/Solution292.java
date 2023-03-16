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
        return reverseList(addTwoNumbersReverse(reverseList(l1),reverseList(l2)));
    }
    private ListNode reverseList(ListNode head) {
        ListNode tempNode = null;
        ListNode prev=null;
        ListNode current=head;
        
        while(current!=null){
            tempNode = current.next;
            current.next=prev;
            prev=current;
            current=tempNode;
        }
        return prev;
    }
    
    private ListNode addTwoNumbersReverse(ListNode l1, ListNode l2) {
        ListNode dummy= new ListNode();
        ListNode temp= dummy;
        int carry=0;
        while(l1!=null || l2!=null|| carry==1){
            int sum=0;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            
            sum+= carry;
            carry=sum/10;
            ListNode node= new ListNode(sum%10);
            temp.next=node;
            temp=temp.next;
            
        }
        return dummy.next;
    }
}
