class Solution {
    public int maxProfit(int[] prices) {
        int i=0;
      int j=i+1;
      
      int profit=0;
      while(i<j && j<prices.length){
        int buy=prices[i];
      int sell=prices[j];
        if(buy>sell){
          i = j;
          j++;
        }
        else{
          profit=Math.max(profit,sell-buy);
          buy=prices[i];
          sell=prices[j];
          j++;
        }
      }
      return profit;
    }
}
