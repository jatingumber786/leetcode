class MyQueue {
    Stack<Integer> s = new Stack<>();
    Stack<Integer> t = new Stack<>();
    public MyQueue() { 
    }
    public void push(int x) {
        while(!s.isEmpty()){
            t.push(s.pop());
        }
        s.push(x);
        while(!t.isEmpty()){
            s.push(t.pop());
        }        
    }
    
    public int pop() {
        return s.pop();
        
    }
    
    public int peek() {
        return s.peek();
    }
    
    public boolean empty() {
        return s.isEmpty();
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