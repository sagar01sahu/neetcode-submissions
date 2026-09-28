class Solution {
    public String longestPalindrome(String s) {
        int maxi=0;
        int start=0;
        for(int i=0;i<s.length();i++){
            int odd=helper(i,s,i);
            int even=helper(i,s,i+1);
            int current=Math.max(odd,even);
            if(current>maxi){
                maxi=current;
                start = i - (current - 1) / 2; 
            }
        }
        return s.substring(start,start+maxi);
    }
    public int helper(int i,String s,int j){
        while(i>=0 && j<s.length()){
            if(s.charAt(i)!=s.charAt(j)){
               break;
            }
            else{
                i--;
                j++;
            }
           
        }
        return j-i-1;
    }
}
