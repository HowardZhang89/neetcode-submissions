class MyHashMap {

    ListNode map[];

    public MyHashMap() {
        this.map = new ListNode[1000];
        for(int i = 0; i < map.length; i++){
            map[i] = new ListNode();
        }
    }
    
    public void put(int key, int value) {
        int mod = key % 1000;
        ListNode curr = map[mod];
        // see if key exists, if so update value
        while(curr.next != null){
            if(curr.next.key == key){
                curr.next.val = value;
                return;
            }
            curr = curr.next;
        }
        // if not, add it
        curr.next = new ListNode(key, value, null);
    }
    
    public int get(int key) {
        int mod = key % 1000;
        ListNode curr = map[mod];
        // see if key exists, if so return value
        while(curr.next != null){
            if(curr.next.key == key){
                return curr.next.val;
            }
            curr = curr.next;
        }
        return -1;
    }
    
    public void remove(int key) {
        int mod = key % 1000;
        ListNode curr = map[mod];
        // see if key exists, if so delete it
        while(curr.next != null){
            if(curr.next.key == key){
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }
    }
}

class ListNode{
    int key, val;
    ListNode next;

    public ListNode(int key, int val, ListNode next){
        this.key = key;
        this.val = val;
        this.next = next;
    }

    public ListNode(){
        this(-1,-1,null);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */