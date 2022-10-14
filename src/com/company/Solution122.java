class Solution {
    public boolean isUnivalTree(TreeNode root) {
        Queue<TreeNode>q= new LinkedList<>();
        int requiredVal=root.val;
        q.add(root);
        while(!q.isEmpty()){
            TreeNode currentNode= q.remove();
            if(currentNode.val!=requiredVal) return false;
            if(currentNode.left!=null) q.add(currentNode.left);
            if(currentNode.right!=null) q.add(currentNode.right);
        }
        return true;
    }
}
