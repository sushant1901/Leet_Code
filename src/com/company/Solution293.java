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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head==null || head.next==null)return null;
        ListNode dummyNode = new ListNode(-1);
        dummyNode .next=head;
        
        ListNode runner= dummyNode;
         for(int i=0;i<n;i++){
            runner =runner.next;
        }
        ListNode follower=dummyNode;
        
       
        
        while(runner.next!=null){
            runner=runner.next;
            follower=follower.next;
        }
        
        follower.next=follower.next.next;
        
        return dummyNode.next;
    }
}
