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
    public ListNode swapPairs(ListNode head) {
        ListNode dummyNode= new ListNode();
        dummyNode.next=head;
        swap(dummyNode);
        return dummyNode.next;
    }

    private void swap(ListNode dummy){
        if(dummy== null) return;
        ListNode first= dummy.next;
        ListNode second=null;
        if(first!=null) second=first.next;

        if(second!=null){
            ListNode secondNext=second.next;
            second.next=first;
            dummy.next=second;
            first.next=secondNext;
            swap(first);
        }
    }
}
