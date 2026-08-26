class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> hs=new HashSet<>();
        int maxi=0;
        int left=0;
        for(int i=0;i<s.length();i++){
            while(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(s.charAt(i));
            maxi=Math.max(maxi,i-left+1);
        }
        return maxi;
    }
}
