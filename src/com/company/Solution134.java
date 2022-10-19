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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> answer=new ArrayList<>();
        levelOrder(answer,root,0);
        return answer;
    }
    private void levelOrder(List<List<Integer>> answer,TreeNode root,int level){
        if(root==null) return ;
        if(answer.size()<=level){
            LinkedList<Integer>newLevel= new LinkedList<>();
            answer.add(newLevel);
        }
        if(level%2==0){
            answer.get(level).add(root.val);
        }else{
            answer.get(level).add(0,root.val);
        }
        
        levelOrder(answer,root.left,level+1);
        levelOrder(answer,root.right,level+1);
    }
}
