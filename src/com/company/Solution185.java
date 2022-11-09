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
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(val);
        TreeNode current=root;
        TreeNode prevNode=null;
        while(current!=null){
            prevNode=current;
            if(current.val>val) current=current.left;
            else current=current.right;
        }
        if(prevNode.val> val) prevNode.left=new TreeNode(val);
        else prevNode.right= new TreeNode(val);
        
        return root;
    }
}
