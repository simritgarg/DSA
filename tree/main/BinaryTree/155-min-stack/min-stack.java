class MinStack {
    Stack<Integer> s;
    Stack<Integer> min;

    public MinStack() {
        s = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        if(min.isEmpty() || val <= min.peek()){
            min.push(val);
        }
    }
    
    public void pop() {
        if(s.isEmpty()) return ;
        int n = s.pop();
        if(n == min.peek()) min.pop();

    }
    
    public int top() {
        if(s.isEmpty()) return -1;
        return s.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */