class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1=word1.length();
      int w2=word2.length();
      
      int i=0;
      int j=0;
      StringBuilder res = new StringBuilder();
      while(i<word1.length() && j<word2.length()){
       res.append(word1.charAt(i)).append(word2.charAt(j));
        i++;
        j++;
        
      }
      
      String v=res.toString();
      if(i==w1 && j!=w2){
        String n=word2.substring(j,w2);
        v+=n;
      }
      else{
        String n=word1.substring(i,w1);
        v+=n;
      }
      return v;
    }
}