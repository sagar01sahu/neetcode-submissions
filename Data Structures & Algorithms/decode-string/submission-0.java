class Solution {
    public String decodeString(String s) {
        Stack<Integer> stnum=new Stack<>();
        Stack<String> ststring=new Stack<>();
        int currentnum=0;
        String currentword="";
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                currentnum=currentnum*10+(c-'0');
            }
            else if(c=='['){
                stnum.push(currentnum);
                ststring.push(currentword);
                currentnum=0;
                currentword="";
            }
            else if(c==']'){
                int k=stnum.pop();
                String g=ststring.pop();
                for(int i=0;i<k;i++){
                    g+=currentword;
                }
                currentword=g;
            }
            else{
                currentword+=c;
            }
        }
        return currentword;
    }
}