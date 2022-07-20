class Solution {
    public int maxDepth(TreeNode root) {
        return height(root);
    }
    private int height(TreeNode root){
        if(root== null) return 0;
        
        int leftans=1+height(root.left);
        int rightans=1+height(root.right);
        return Math.max(leftans,rightans);
    }
}
