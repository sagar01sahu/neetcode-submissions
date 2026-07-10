class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            } else {
                // ERROR 1: Check if stack is empty before peeking/popping
                if (st.isEmpty()) return false; 
                
                char d = st.pop(); // Combine peek and pop for efficiency
                if ((c == ')' && d != '(') || 
                    (c == ']' && d != '[') || 
                    (c == '}' && d != '{')) {
                    return false;
                }
            }
        }
        // ERROR 2: Stack must be empty at the end (for strings like "(")
        return st.isEmpty(); 
    }
}
