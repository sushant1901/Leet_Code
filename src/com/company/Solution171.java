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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> inorderHashMap = new HashMap<>();
        for(int i = 0; i < inorder.length; i++){
            inorderHashMap.put(inorder[i], i);
        }
        
        return constructTree(preorder, inorderHashMap, 0, preorder.length - 1, new int[1]);
        
    }
    
    private TreeNode constructTree(int[] preorder, HashMap<Integer, Integer> inorderHashMap, int start, int end, int[] preIndex){
        if(start > end ){
            return null;
        }
        
        int currentVal = preorder[preIndex[0]];
        int currentIndex = inorderHashMap.get(currentVal);
        preIndex[0]++;
        
        TreeNode root = new TreeNode(currentVal);
        
        root.left = constructTree(preorder, inorderHashMap, start, currentIndex - 1, preIndex);
        root.right = constructTree(preorder, inorderHashMap, currentIndex + 1, end, preIndex);
        
        return root;
        
    }
    
}
