class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<Integer>> l=new ArrayList<>();
        Map<String, List<String>> m = new HashMap<>(); 
        for(int i=0;i<strs.length;i++){
            char [] a=strs[i].toCharArray();
            Arrays.sort(a);
            String b=String.valueOf(a);
            if(!m.containsKey(b)){
                m.put(b,new ArrayList<>());
            }
            m.get(b).add(strs[i]);
        }
        return new ArrayList<>(m.values());
        
    }
}
