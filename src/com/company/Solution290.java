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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyNode= new ListNode(-1);
        dummyNode.next=head;
        
        ListNode current= head;
        ListNode prev=dummyNode;
        
        while(current!=null){
            if(current.val==val)
                prev.next=current.next;
            else
                prev=current;
            current=current.next;
        }
        
        return dummyNode.next;
    }
}
