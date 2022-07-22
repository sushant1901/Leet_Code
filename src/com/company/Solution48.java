class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer>answer=new ArrayList<Integer>();
        preorderTraversal(root,answer);
        return answer;
        
    }
    private void preorderTraversal(Node root,List<Integer>answer){
        if(root== null)return;
        
        answer.add(root.val);
        List<Node>childrens=root.children;
        for(Node currentChild:childrens)
            preorderTraversal(currentChild,answer);
        
        return;
    }
}
