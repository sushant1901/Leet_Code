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
    public int maxLevelSum(TreeNode root) {
        int maxLevel=0;
        int maxSum=Integer.MIN_VALUE;
        int currentLevel=1;
        Queue<TreeNode> queue= new LinkedList();
        queue.add(root);
        while(!queue.isEmpty()){
            int size= queue.size();
            int runningSum=0;

            for(int i=0;i<size;i++){
                TreeNode curr=queue.poll();
                runningSum+=curr.val;

                if(curr.left !=null) queue.add(curr.left);
                if(curr.right !=null) queue.add(curr.right);
            }

            if(runningSum > maxSum){
                maxSum=runningSum;
                maxLevel=currentLevel;
            }
            currentLevel++;
        }

        return maxLevel;
    }
}
