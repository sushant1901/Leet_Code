class Solution {
     public ListNode middle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
  
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head== null)return true;
        ListNode mid =middle(head);
        ListNode curr= head;
        ListNode last=reverse(mid.next);
        while(last!=null){
            if(last.val!=curr.val)return false;
            last=last.next;
            curr=curr.next;
        }
        return true;
        
    }
   
   

}
