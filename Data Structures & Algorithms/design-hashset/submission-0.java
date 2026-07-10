class MyHashSet {
     private  final int capacity=769;
     private List<Integer>[] b;
    public MyHashSet() {
        b=new LinkedList[capacity];
        for(int i=0;i<capacity;i++)
        b[i]=new LinkedList<>();
    }
    private int hash(int key){
        return key%capacity;
    }
    public void add(int key) {
        int index=hash(key);
        if (!b[index].contains(key)) { 
        b[index].add(key); 
    }
    }
    public void remove(int key) {
        int index = hash(key); 
        b[index].remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        int index = hash(key); 
    return b[index].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */