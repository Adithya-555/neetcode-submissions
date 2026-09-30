class MyHashSet {
        List<Integer>l1;
    public MyHashSet() {
        l1 = new LinkedList<>();
    }
    
    public void add(int key) {
       if(!l1.contains(key)){
        l1.add(key);
       }
       
    }
    
    public void remove(int key) {
      if(!l1.isEmpty()){
        l1.remove(Integer.valueOf(key));
      }
      
        
    }
    
    public boolean contains(int key) {
        if(l1.contains(key)){
            return true;
        }
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