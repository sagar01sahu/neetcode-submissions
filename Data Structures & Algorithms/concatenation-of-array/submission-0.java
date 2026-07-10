class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] ans=new int[(nums.length)*2];
        int count=2;
        int i=0;
        int j=0;
        while(j!=ans.length){
            if(i==nums.length){
                i=0;
            }
            ans[j]=nums[i];
            j++;
            i++;

        }
        return ans;
        
    }
}