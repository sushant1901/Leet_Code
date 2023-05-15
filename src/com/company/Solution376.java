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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        ListNode iterator=head;
        ArrayList<Integer> List= new ArrayList();

        while(iterator!=null){
            List.add(iterator.val);
            iterator=iterator.next;

        }

        int size=List.size();
        int i=0;
        swap(List,k-1,size-k);

        while(temp!=null){
            temp.val=List.get(i);
            temp=temp.next;
            i++;
        }
        return head;

    }

    private ArrayList<Integer> swap(ArrayList<Integer> aL,int p,int q){
        int temp=aL.get(p);
        aL.set(p,aL.get(q));
        aL.set(q,temp);

        return aL;
    }

}
