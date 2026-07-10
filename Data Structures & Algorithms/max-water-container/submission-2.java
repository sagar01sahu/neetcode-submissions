class Solution {
    public int maxArea(int[] heights) {
        int maxWater = 0;
        int left = 0;
        int right = heights.length - 1;

        while (left < right) {
            // Calculate area with current pointers
            int width = right - left;
            int height = Math.min(heights[left], heights[right]);
            int currentArea = width * height;
            
            maxWater = Math.max(maxWater, currentArea);

            // Move the pointer pointing to the shorter line
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }
}
