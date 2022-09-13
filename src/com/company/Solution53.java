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
    public List<String> binaryTreePaths(TreeNode root) {
      List<String> answer=new ArrayList<>();
       binaryPath(root,""+Integer.toString(root.val),answer);
        return answer;
    }
    private void binaryPath(TreeNode root,String currentPath,List<String>answer){
        if(root.left == null && root.right==null){
           answer.add(currentPath );
            return ;
        }
        
        if(root.left !=null){
            binaryPath(root.left,currentPath+"->"+Integer.toString(root.left.val),answer);
        }
        if(root.right !=null){
            binaryPath(root.right,currentPath+"->"+Integer.toString(root.right.val),answer);
        }
        
        return;
    }
}
