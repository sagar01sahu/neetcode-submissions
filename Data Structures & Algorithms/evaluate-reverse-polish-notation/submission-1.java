

class Solution { 
    public int evalRPN(String[] tokens) { 
        Stack<Integer> st = new Stack<>(); 
        
        for (String s : tokens) { 
            // Check if the token is an operator
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                // Pop the top two elements
                int b = st.pop(); 
                int a = st.pop(); 
                
                // Apply the operator and push the result back
                if (s.equals("+")) {
                    st.push(a + b);
                } else if (s.equals("-")) {
                    st.push(a - b);
                } else if (s.equals("*")) {
                    st.push(a * b);
                } else {
                    st.push(a / b);
                }
            } else { 
                // Token is a number, parse and push it
                st.push(Integer.parseInt(s)); 
            } 
        } 
        return st.pop(); 
    } 
}
