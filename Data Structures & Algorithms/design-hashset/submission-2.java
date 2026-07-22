class MyHashSet {
    int size;
    ListNode[] hashset;

    public MyHashSet() {
        this.size = 10000;
        this.hashset = new ListNode[size];
        for(int i = 0; i < size; i++){
            hashset[i] = new ListNode(0);
        }
    }
    
    public void add(int key) {
        ListNode curr = hashset[key % this.size];
        while(curr.next != null){
            if(curr.next.key == key){return;}
            curr = curr.next;
        }
        curr.next = new ListNode(key);
    }
    
    public void remove(int key) {
        ListNode curr = hashset[key % this.size];
        while(curr.next != null){
            if(curr.next.key == key){
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }
    }
    
    public boolean contains(int key) {
        ListNode curr = hashset[key % this.size];
        while(curr.next != null){
            if(curr.next.key == key){return true;}
            curr = curr.next;
        }
        return false;
    }
}

public class ListNode {
    int key;
    ListNode next;

    public ListNode(int key){
        this.key = key;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */