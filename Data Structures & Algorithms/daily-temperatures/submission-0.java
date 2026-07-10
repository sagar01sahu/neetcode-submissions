class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       
      
        int[] arr=new int[temperatures.length];
        for(int i=0;i<temperatures.length-1;i++){
              int j=i+1;
            while(j<temperatures.length){
            if(temperatures[j]>temperatures[i]){
                arr[i]=Math.abs(j-i);
                break;
            }
            else{
                j++;
            }
            
        }
    }
    return arr;
    }
}
