class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Boolean> m1=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!m1.containsKey(nums[i]))
            m1.put(nums[i],true);
            else
            m1.put(nums[i],false);
        }
        for(int i=0;i<nums.length;i++){
            if(m1.get(nums[i])==false)
            return true;
        }
        return false;
    }
}