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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> answer= new ArrayList<>();
        Stack<TreeNode> stack= new Stack<>();
        if(root==null)
            return answer;
        stack.push(root);
        
        while(!stack.isEmpty()){
            TreeNode currentNode=stack.pop();
            answer.add(currentNode.val);
            if(currentNode.left!=null){
                stack.push(currentNode.left);
                
            }
            if(currentNode.right!=null){
                stack.push(currentNode.right);
                
            }
            
            
        }
        Collections.reverse(answer);
        return answer;
    }
}
