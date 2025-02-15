class MyStack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    public void push(int x) {
        q1.add(x);
    }
    public int pop() {
        if(empty()){
            return -1;
        }   
        while(q1.size()>1){
            q2.add(q1.poll());
        }
        int ele = q1.poll();
        Queue<Integer> temp = q2;
        q2=q1;
        q1=temp;
        return ele;
    }
    
    public int top() {
        if(empty()){
            return -1;
        }   
        while(q1.size()>1){
            q2.add(q1.poll());
        }
        int ele = q1.poll();
        q2.add(ele);
        Queue<Integer> temp = q2;
        q2=q1;
        q1=temp;
        return ele;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */