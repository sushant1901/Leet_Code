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
class pair{
    TreeNode node;
    Boolean left;
    pair(TreeNode node,boolean left){
        this.node= node;
        this.left= left;
    }
}
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        Queue<pair>q= new LinkedList<>();
        int total=0;
        q.add(new pair(root,false));
        while(!q.isEmpty()){
            pair currentPair=q.remove();
            TreeNode currentNode=currentPair.node;
            boolean isLeft=currentPair.left;
            if(currentNode.left == null && currentNode.right==null && isLeft==true) 
                total+=currentNode.val;
            
            if(currentNode.left!=null)
                q.add(new pair(currentNode.left,true));
            
            if(currentNode.right!=null)
                q.add(new pair(currentNode.right,false));
        }
        return total;
    }
}
