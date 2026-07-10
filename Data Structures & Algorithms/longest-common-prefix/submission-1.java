class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s="";
        Arrays.sort(strs);
        String a=strs[0];
        String b=strs[strs.length-1];
        for(int i=0;i<a.length();i++){
               if(a.charAt(i)!=b.charAt(i))
               return s;
               s=s+a.charAt(i); 
        }
        return s;
    }
}