class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
       List<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val)
            continue;
            else
            res.add(nums[i]);
        }
        for(int i=0; i<res.size(); i++) {
            nums[i] = res.get(i);
        }
        return res.size();
    }
}