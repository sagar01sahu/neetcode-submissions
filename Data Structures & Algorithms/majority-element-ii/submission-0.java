class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> m1=new HashMap<>();
        for(int i:nums){
            m1.put(i,m1.getOrDefault(i,0)+1);
        }
        // System.out.println(m1.size());
      List<Integer> res=new ArrayList<>();
      for (Map.Entry<Integer,Integer> entry : m1.entrySet()) {
          if(entry.getValue()>n/3)
          res.add(entry.getKey());
        
      }
      return res;
    }
}