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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next=head;
         
        ListNode prevNode=dummyNode;
        ListNode currentNode=head;
        
        while(currentNode!=null){
            boolean flag=false;
            while(currentNode.next!=null && currentNode.next.val==currentNode.val){
                flag=true;
                currentNode=currentNode.next;
            }
            
            
            if(flag){
                prevNode.next=currentNode.next;
            }else{
                prevNode=currentNode;
            }
            
            currentNode=currentNode.next;
        }
        
        return dummyNode.next;
    }
}
