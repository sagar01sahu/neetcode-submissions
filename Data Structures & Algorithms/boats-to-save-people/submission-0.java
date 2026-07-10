class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        
        int boats = 0;
        int left = 0;                  // Pointer for the lightest person
        int right = people.length - 1; // Pointer for the heaviest person
        
        // 2. Iterate until all people are accounted for
        while (left <= right) {
            // Every iteration represents sending out at least one boat
            boats++;
            
            // 3. Check if the lightest person can share the boat with the heaviest
            if (people[left] + people[right] <= limit) {
                // If they fit together, move the left pointer forward
                left++;
            }
            
            // 4. The heaviest person always takes the boat
            right--;
        }
        
        return boats;
    }
}