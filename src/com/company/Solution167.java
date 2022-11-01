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
    int sum=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        rangeSum(root,low,high);
        return sum;
    }
    
    private void rangeSum(TreeNode node,int l,int r){
        if(node!= null){
            if(l<=node.val && r>= node.val){
                sum+=node.val;
            }
            if(l<node.val){
                rangeSum(node.left,l,r);
            }
            if(node.val<r){
                rangeSum(node.right,l,r);
            }
        }
    }
    
}
