class Solution {
    public boolean lemonadeChange(int[] bills) {
        int r5=0;
      int r10=0;
      int r20=0;
      Boolean[] res=new Boolean[bills.length];
      for(int i=0;i<bills.length;i++){
        if(bills[i]==5){
          // change+=5;
          r5++;
          res[i]=true;
        }
        else if(bills[i]==10 && r5!=0){
          r10++;
          r5--;
          res[i]=true;
        }
        else if(bills[i]==20){
          if(r5>=3){
          res[i]=true;
          r5-=3;}
          else if(r5>=1 && r10>=1){
            res[i]=true;
            r5--;
            r10--;
          }
          else{
            res[i]=false;
          }
          
        }
        else{
          res[i]=false;
        }
      }
      for(Boolean i:res){
        if(i==false){
        
          return false;
        }
        
      }
      return true;
    }
}