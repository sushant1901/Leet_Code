class Solution {
    public int maxDepth(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        int height=0;
        if(root==null)return height;
        q.add(root);
        while(!q.isEmpty()){
            int currentLevelSize= q.size();
            while(currentLevelSize >0){
                TreeNode currentNode=q.remove();
                if(currentNode.left!=null) q.add(currentNode.left);
                if(currentNode.right!=null) q.add(currentNode.right);
                
                currentLevelSize-=1;
            }
            
            height+=1;
        }
        return height;
    }
}
