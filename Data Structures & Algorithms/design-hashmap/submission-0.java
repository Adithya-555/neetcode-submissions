class MyHashMap {
      ArrayList<Integer> k;
      ArrayList<Integer>v;

    public MyHashMap() {
        k = new ArrayList<>();
        v = new ArrayList<>();
    }
    
    public void put(int key, int value) {
        if(k.contains(key)){
            int index = k.indexOf(key);
            v.set(index,value);
        }
        else{
            k.add(key);
            v.add(value);
        }
    }
    
    public int get(int key) {
        if(k.contains(key)){
            int index = k.indexOf(key);
            return v.get(index);
        }
        return -1;
        
    }
    
    public void remove(int key) {
        
        if(k.contains(key)){
            int index = k.indexOf(key);
            k.remove(index);
            v.remove(index);
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */