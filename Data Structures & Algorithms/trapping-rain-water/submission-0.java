class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int maxi=0;
        int left=0;
        int right=n-1;
        int maxileft=0;
        int maxiright=0;
        while(left<right){
                if(height[left]<=height[right]){
                    if(height[left]>maxileft)
                    maxileft=height[left];
                    else{
                        maxi+=maxileft-height[left];
                    }
                    left++;
                }
                else{
                    if(height[right]>=maxiright)
                    maxiright=height[right];
                    else{
                        maxi+=maxiright-height[right];
                    }
                   right--;
                }
        }
        return maxi;
    }
}
