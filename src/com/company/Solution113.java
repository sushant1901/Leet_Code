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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> answer= new ArrayList<>();
        Queue <TreeNode>q= new LinkedList<>();
        if(root==null)
            return answer;
        q.add(root);
        while(!q.isEmpty()){
            int currentSize=q.size();
            List<Integer> currentLevel= new ArrayList<>();
            while(currentSize>0){
            TreeNode currentNode=q.remove();
            currentLevel.add(currentNode.val);
            if(currentNode.left!=null){
                q.add(currentNode.left);
            }
            if(currentNode.right!=null){
                q.add(currentNode.right);
            }
           currentSize-=1;
            
        }
            
        answer.add(currentLevel);
        }
        return answer;
    }
}
