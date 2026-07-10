class Solution {
    public int majorityElement(int[] nums) {
        int major = nums[0];
        int count = 1;
        
        // Start from the second element since the first is already initialized
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                // If count drops to 0, pick the current element as the new candidate
                major = nums[i];
                count = 1;
            } else if (nums[i] == major) {
                // Same element increases confidence
                count++;
            } else {
                // Different element decreases confidence
                count--;
            }
        }
        
        return major;
    }
}
