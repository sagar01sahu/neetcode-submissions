class Solution {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]", "");
        result=result.toLowerCase();
        System.out.println(result);
        char [] res=result.toCharArray();
        int i=0;
        int j=res.length-1;
        while(i<j){
            if(res[i]!=res[j])
            return false;
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}
