class MyHashSet {
    private  Map<Integer,Integer>m=new HashMap<>();
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        m.put(key,1);
    }
    
    public void remove(int key) {
        if(m.containsKey(key))
        m.remove(key);
   }
    
    public boolean contains(int key) {
        if(m.containsKey(key))
        return true;
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */