class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer>answer=new ArrayList<Integer>();
        postorderTraversal(root,answer);
        return answer;
    }
    private void postorderTraversal(Node root,List<Integer>answer){
        if(root==null)return;
        List<Node>childrens=root.children;
        for(Node currentChild:childrens)
            postorderTraversal(currentChild,answer);
        answer.add(root.val);
        return;
    }
}
