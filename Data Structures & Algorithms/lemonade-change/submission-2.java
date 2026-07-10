class Solution {
    public boolean lemonadeChange(int[] bills) {
        int bill5=0;
        int bill10=0;
        int bill20=0;
        for(int i:bills){
            if(i==5){
                bill5++;
            }
            else if(i==10){
                    if(bill5>0){
                        bill5--;
                        bill10++;
                    }
                    else {
                        return false;
                    }
            }
            else{
                if((bill5>0 && bill10>0)||(bill5>=3)){
                    bill20++;
                    if(bill5>0 && bill10>0){
                        bill5--;
                        bill10--;
                    }
                    else{
                        bill5=bill5-3;
                    }
                }
                else
                return false;
            }
        }
        return true;
    }
}