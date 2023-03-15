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
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    public boolean dfs(TreeNode node, int index, int n) {
        if (node == null) {
            return true;
        }
        if (index >= n) {
            return false;
        }
        return dfs(node.left, 2 * index + 1, n) &&
                dfs(node.right, 2 * index + 2, n);
    }
    public boolean isCompleteTree(TreeNode root) {
        return dfs(root, 0, countNodes(root));
    }
}
