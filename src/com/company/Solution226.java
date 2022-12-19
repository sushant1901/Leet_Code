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
    public TreeNode bstFromPreorder(int[] preorder) {
        return buildTree(preorder,new int[]{0},1001);
    }
    private TreeNode buildTree(int[] preorder,int[]preIndex,int boundVal){
        if(preIndex[0]>=preorder.length || preorder[preIndex[0]]>boundVal){
            return null;
        }

        TreeNode newNode= new TreeNode(preorder[preIndex[0]]);
        preIndex[0]+=1;
        newNode.left=buildTree(preorder,preIndex,newNode.val-1);
        newNode.right=buildTree(preorder,preIndex,boundVal);

        return newNode;
    }
}
