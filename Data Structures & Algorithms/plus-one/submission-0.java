class Solution {
    public int[] plusOne(int[] digits) {
        int i=digits.length-1;
    while(i>=0){
      if(digits[i]==9){
      digits[i]=0;
      i--;}
      else{
      digits[i]+=1;
        break;
      }
    }
    if(i==-1){
      int[]res=new int[digits.length+1];
      res[0]=1;
      return res;
    }
    else
    return digits;
    }
}
