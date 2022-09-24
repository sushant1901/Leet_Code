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
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode>stack=new Stack<>();
        List<Integer> answer= new ArrayList<>();
        if(root==null)
            return answer; 
        
        addLeftSubTree(root,stack);
        
        while(!stack.isEmpty()){
            TreeNode currentNode=stack.pop();
            answer.add(currentNode.val);
            if(currentNode.right != null){
                addLeftSubTree(currentNode.right,stack);
            } 
        }
         return answer;
        
    }
    
    private void addLeftSubTree(TreeNode currentNode,Stack<TreeNode>stack){
        stack.push(currentNode);
        while(currentNode.left!=null){
            stack.push(currentNode.left);
           currentNode= currentNode.left;
            
        }
        return;
            
    }
}
