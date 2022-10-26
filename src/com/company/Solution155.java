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

class Pair{
    TreeNode parent;
    TreeNode node;
    Pair(TreeNode node, TreeNode parent){
        this.node= node;
        this.parent=parent;
    }
}
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<Pair>queue= new LinkedList<>();
        TreeNode parentOfX=null;
        TreeNode parentOfY=null;
        
        queue.add(new Pair(root,new TreeNode(-1)));
        
        while(!queue.isEmpty()){
            int currentSize= queue.size();
            for(int i=0;i<currentSize;i++){
                Pair currentPair=queue.remove();
                TreeNode currentNode=currentPair.node;
                TreeNode currentParent= currentPair.parent;
                
                if(currentNode.val==x){
                    parentOfX=currentParent;
                }
                if(currentNode.val==y){
                    parentOfY=currentParent;
                }
                
                if(currentNode.left !=null){
                    queue.add(new Pair(currentNode.left, currentNode));
                }
                if(currentNode.right !=null){
                    queue.add(new Pair(currentNode.right,currentNode));
                }
                
            }
            
            if(parentOfX !=null && parentOfY != null){
                return parentOfX.val !=parentOfY.val;
            }
            
            if(parentOfX != null || parentOfY!= null){
                return false;
            }
        }
        return false;
    }
}
