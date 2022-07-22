class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>answer=new ArrayList<Integer>();
        inorder(root,answer);
        return answer;
        
    }
    private void inorder(TreeNode root,List<Integer>answer){
        if(root==null)return;
        inorder(root.left,answer);
        answer.add(root.val);
        inorder(root.right,answer);
        return ;
    }
}
