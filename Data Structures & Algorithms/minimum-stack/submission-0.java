

class MinStack { 
    // Main stack to hold all elements
    private Stack<Integer> st = new Stack<>(); 
    
    // Auxiliary stack to track the minimum element at each level
    private Stack<Integer> minSt = new Stack<>(); 

    public MinStack() { } 

    public void push(int val) { 
        st.push(val); 
        
        // Push to minSt if it is empty or the new value is <= current minimum
        if (minSt.isEmpty() || val <= minSt.peek()) {
            minSt.push(val);
        }
    } 

    public void pop() { 
        // If the top element is the current minimum, remove it from minSt too
        if (st.peek().equals(minSt.peek())) {
            minSt.pop();
        }
        st.pop(); 
    } 

    public int top() { 
        return st.peek(); 
    } 

    public int getMin() { 
        // The top of minSt always holds the minimum element in O(1) time
        return minSt.peek(); 
    } 
}
