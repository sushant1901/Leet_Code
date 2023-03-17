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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next=head;
        
        ListNode current = dummyNode;
        ListNode prev=null;
        
        for(int i=0;i<left;i++){
            prev=current;
            current=current.next;
            
        }
        
        prev.next=reverseList(current,right-left+1);
        return dummyNode.next;
        
    }
    
    private ListNode reverseList(ListNode l,int n){
        ListNode current=l;
        ListNode prev= null;
        for(int i=0;i<n;i++){
            ListNode tempNode=current.next;
            current.next=prev;
            prev=current;
            current=tempNode;
        }
        l.next=current;
        return prev;
    }
}
