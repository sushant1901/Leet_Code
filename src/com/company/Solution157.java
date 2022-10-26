class MyQueue {
    Stack<Integer> pushStk;
    Stack<Integer> popStk;

    public MyQueue() {
        pushStk= new Stack<>();
        popStk= new Stack<>();
        
    }
    
    public void push(int x) {
        pushStk.push(x);
    }
    
    public int pop() {
        if(popStk.isEmpty()){
            conversion();
        }
        return popStk.pop();
    }
    
    public int peek() {
        if(popStk.isEmpty()){
            conversion();
        }
        return popStk.peek();
    }
    
    public boolean empty() {
        return pushStk.isEmpty() && popStk.isEmpty();
    }
    private void conversion(){
        int size=pushStk.size();
        for(int i=0;i<size;i++){
            int top=pushStk.pop();
            popStk.push(top);
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
