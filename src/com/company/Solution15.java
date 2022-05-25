class Solution {
    public ListNode reverseList(ListNode head) {
        if(head== null|| head.next==null)return head;
        ListNode newhead= reverseList(head.next);
        ListNode headNext=head.next;
        headNext.next= head;
        head.next=null;
        return newhead;
        
        
    }
}
