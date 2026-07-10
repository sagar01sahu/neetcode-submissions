class Solution {
    public static int binary(int [] num,int st,int end,int tar){
    if (st > end) {
            return -1;
        }
    int mid=st+(end-st)/2;
    if(num[mid]==tar)
    return mid;
    else if(tar<num[mid])
    return binary(num,st,mid-1,tar);
    else 
    return binary(num,mid+1,end,tar);
    
    
  }
    public int search(int[] nums, int target) {
        int ans=binary(nums,0,nums.length-1,target);
        return ans;
    }
}
