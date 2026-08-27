class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxi=nums[0];
        int current=nums[0];
        for(int i=1;i<nums.length;i++){
             current=Math.max(nums[i],current+nums[i]);
             if(current>maxi)
             maxi=current;
        }
        int currentmin=nums[0];
        int mini=nums[0];
        for(int i=1;i<nums.length;i++){
            currentmin=Math.min(nums[i],currentmin+nums[i]);
            if(currentmin<mini)
            mini=currentmin;
        }
        int total=0;
        for(int i:nums){
            total+=i;
        }
        if(maxi<0)
        return maxi;
        return Math.max(maxi,total-mini);
    }
}