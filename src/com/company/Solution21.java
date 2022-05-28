class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
   if(head.next == null) {
       return null;
   }
  
  
   int size = 0;
   ListNode temp = head;
   while(temp != null) {
       temp = temp.next;
       size++;
   }
  
   //removing SIZEth node from last i.e. head
   if(n == size) {
       return head.next;
   }
  
   //find previous node
   int ptf = size - n; // position to find
   ListNode prev = head; // previous node
   int cp = 1; // current position
  
   while(cp != ptf) {
       prev = prev.next;
       cp++;
   }
  
   prev.next = prev.next.next;
   return head;
}
}
