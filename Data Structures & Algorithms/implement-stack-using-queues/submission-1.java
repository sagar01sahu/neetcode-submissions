class MyStack {
        private  Queue<Integer> q1=new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        q1.offer(x);
    }
    
    public int pop() {
        int a=0;
        if(!q1.isEmpty()){
            Queue<Integer> q2=new LinkedList<>();
            int count=q1.size();
            while(count>1){
                q2.offer(q1.poll());
                count--;
            }
            a=q1.poll();
            while(!q2.isEmpty()){
                q1.offer(q2.poll());
            }
        }
        return a;
    }
    
    public int top() {
        int a=0;
        if(!q1.isEmpty()){
            Queue<Integer> q2=new LinkedList<>();
            int count=q1.size();
            while(count>1){
                q2.offer(q1.poll());
                count--;
            }
             a=q1.poll();
            q2.offer(a);
            while(!q2.isEmpty()){
                q1.offer(q2.poll());
            }
        }
        return a;
    }
    
    public boolean empty() {
        if(q1.isEmpty())
        return true;
        return false;
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