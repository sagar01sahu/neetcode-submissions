class Solution {
  public static void Swapping(int[] arr, int start, int end) {
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}
    public void rotate(int[] nums, int k) {
         int n = nums.length;
    if (n <= 1) return; // Edge case: empty or single-element array
    
    k = k % n; // Correct way to handle large k
    if (k == 0) return; // Optimization: no rotation needed
    
    // 1. Reverse entire array
    Swapping(nums, 0, n - 1);
    // 2. Reverse first k elements
    Swapping(nums, 0, k - 1);
    // 3. Reverse remaining n-k elements
    Swapping(nums, k, n - 1);
    }
}