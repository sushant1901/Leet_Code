class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> answer = new ArrayList<>();
        
        if(root == null){
            return answer;
        }
        
        rootToLeaf(root, answer, String.valueOf(root.val));
        
        return answer;
        
    }
    
    private void rootToLeaf(TreeNode root, List<String> answer, String currentString){
        
        if(root.left == null && root.right == null){
            answer.add(currentString );
        }
        
        if(root.left != null){
            rootToLeaf(root.left, answer, currentString + "->" + String.valueOf(root.left.val));
        }
        
        if(root.right != null){
            rootToLeaf(root.right, answer, currentString + "->" + String.valueOf(root.right.val));
        }
        
        return;
        
    }
    
}
