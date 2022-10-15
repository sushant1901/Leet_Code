/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Pair{
    TreeNode p;
    TreeNode q;
    
    Pair(TreeNode p,TreeNode q ){
        this.p=p;
        this.q=q;
    }
}
class Solution {
    public boolean isSameTree(TreeNode t1, TreeNode t2) {
        Queue<Pair> queue= new LinkedList<>();
        queue.add(new Pair(t1,t2));
        while(!queue.isEmpty()){
            Pair currentPair=queue.remove();
            TreeNode p=currentPair.p;
            TreeNode q=currentPair.q;
            
            if(p==null && q==null) continue;
            
            if(p==null || q==null || p.val!=q.val)
                return false;
            if(p.left!=null || q.left!=null)
                queue.add(new Pair(p.left,q.left));
            if(p.right!=null || q.right!=null)
                queue.add(new Pair(p.right,q.right));
        }
        return true;
    }
}
