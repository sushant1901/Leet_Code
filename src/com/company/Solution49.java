class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>answer=new ArrayList<Integer>();
        postorder(root,answer);
        return answer;
        
    }
    private void postorder(TreeNode root,List<Integer>answer ){
        if(root==null){
            return;
        }
        postorder(root.left,answer);
        postorder(root.right,answer);
        answer.add(root.val);
        return;
    }
}
