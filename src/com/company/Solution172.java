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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
      HashMap<Integer, Integer> inorderHashMap = new HashMap<>();
        for(int i = 0; i < inorder.length; i++){
            inorderHashMap.put(inorder[i], i);
        }
        
        int[] preIndex = new int[1];
        preIndex[0] = postorder.length - 1;
        return constructTree(postorder, inorderHashMap, 0, postorder.length - 1, preIndex);
        
    }
    
    private TreeNode constructTree(int[] postorder, HashMap<Integer, Integer> inorderHashMap, int start, int end, int[] preIndex){
        if(start > end ){
            return null;
        }
        
        int currentVal = postorder[preIndex[0]];
        int currentIndex = inorderHashMap.get(currentVal);
        preIndex[0]--;
        
        TreeNode root = new TreeNode(currentVal);
        
        root.right = constructTree(postorder, inorderHashMap, currentIndex + 1, end, preIndex);
        root.left = constructTree(postorder, inorderHashMap, start, currentIndex - 1, preIndex);
        
        
        return root;
        
    }
    
}
