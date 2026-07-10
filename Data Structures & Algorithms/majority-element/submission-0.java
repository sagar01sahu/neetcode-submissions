class Solution {
    public int majorityElement(int[] nums) {
        int can=0;
        int count=0;
        for(int n:nums){
            if(count==0){
                can=n;
                count++;
            }
            else if(n==can)
            count++;
            else
            count--;
        }
        count = 0;
        for (int n : nums) {
            if (n == can) {
                count++;
            }
        }
        if(count>nums.length/2)
        return can;
        return -1;
    }
}