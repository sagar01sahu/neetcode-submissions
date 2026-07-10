class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
    int currentSum = 0;
    // Map stores <PrefixSum, Frequency>
    Map<Integer, Integer> map = new HashMap<>();
    
    // Base case: To handle subarrays that start from index 0
    map.put(0, 1);
    
    for (int i = 0; i < nums.length; i++) {
        currentSum += nums[i];
        
        // Check if (currentSum - k) exists in the map
        // This represents the number of times a valid subarray ended before now
        if (map.containsKey(currentSum - k)) {
            count += map.get(currentSum - k);
        }
        
        // Store/Update the frequency of the current prefix sum
        map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
    }
    
    return count;
    }
}