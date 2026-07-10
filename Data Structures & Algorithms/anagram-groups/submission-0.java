class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>m1=new HashMap<>();
      for(String i:strs){
        char [] a=i.toCharArray();
        Arrays.sort(a);
        String g=new String(a);
        if(!m1.containsKey(g)){
          m1.put(g,new ArrayList<>());
        }
        m1.get(g).add(i);
        
      }
      return new ArrayList<>(m1.values());
    }
}
