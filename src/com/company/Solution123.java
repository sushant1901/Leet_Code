class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode>q= new LinkedList<>();
        List<Double>answer= new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            int currentLevelSize=q.size();
            int count=currentLevelSize;
            double sumOfNodesAtLevel=0;
            
            while(currentLevelSize>0){
                TreeNode currentNode=q.remove();
                sumOfNodesAtLevel+=currentNode.val;
                if(currentNode.left!=null) q.add(currentNode.left);
                if(currentNode.right!=null) q.add(currentNode.right);
                
                currentLevelSize-=1;
                
            }
            answer.add(sumOfNodesAtLevel/count);
        }
        return answer;
    }
}
