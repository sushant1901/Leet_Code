/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> answer= new ArrayList<>();
        Stack<Node> stack= new Stack<>();
        if(root==null)
            return answer;
        stack.push(root);
        
        while(!stack.isEmpty()){
            Node currentNode=stack.pop();
            
            answer.add(currentNode.val);
            List<Node> childrens=currentNode.children;
            
            for(int i=childrens.size()-1;i>=0;i--){
                Node currentChild=childrens.get(i);
                stack.push(currentChild);
            }
            
        }
        return answer;
    }
}
