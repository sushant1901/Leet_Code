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
    public TreeNode deleteNode(TreeNode root, int key) {
    if(root == null){
            return null;
        }
        else if(root.val > key){
            root.left = deleteNode(root.left, key);
        }
        else if(root.val < key){
            root.right = deleteNode(root.right, key);
        }
        else{
            if(root.left == null && root.right == null){
                root = null;
                return root;
            }
            else if(root.left != null && root.right == null){
                root = root.left;
                return root;
            }
            else if(root.left == null && root.right != null){
                root = root.right;
                return root;
            }
            else{
                
                TreeNode rightSubTree = root.right;
                TreeNode leftMostNode = findLeftMostNode(rightSubTree);
                
                root.val = leftMostNode.val;
                leftMostNode.val = key;
                
                root.right = deleteNode(rightSubTree, key);
                
            }
        }
        
        return root;
        
    }
    
    private TreeNode findLeftMostNode(TreeNode current){
        
        while(current.left != null){
            current = current.left;
        }
        
        return current;
        
    }
}
