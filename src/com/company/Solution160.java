/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Queue<Node>queue= new LinkedList<>();
        if(root==null) return root;
        queue.add(root);
        
        while(!queue.isEmpty()){
            int currentSize=queue.size();
            // ArrayList<Node> currentLevel= new ArrayList<>();
            
        Node prevNode=null;
            for(int i=0;i<currentSize;i++){
                Node currentNode=queue.remove();
                // currentLevel.add(currentNode);
                
                if(i!=0){
                    prevNode.next=currentNode;
                }
                
                prevNode=currentNode;
                if(currentNode.left != null) 
                    queue. add(currentNode.left);
                if(currentNode.right!= null) 
                    queue.add(currentNode.right);
            }
            // for(int i= 0;i< currentSize;i++){
            //     if(i==currentSize-1) currentLevel.get(i).next=null;
            //     else currentLevel.get(i).next=currentLevel.get(i+1);
            // }
        }
        return root;
    }
}
