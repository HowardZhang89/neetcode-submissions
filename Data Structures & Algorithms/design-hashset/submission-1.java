class MyHashSet {
    int size;
    ListNode[] hashset;

    public MyHashSet() {
        this.size = 10000;
        this.hashset = new ListNode[size];
        for(int i = 0; i < size; i++){
            hashset[i] = new ListNode();
        }
    }
    
    public void add(int key) {
        int index = key % this.size;
        ListNode curr = hashset[index];
        while(curr.next != null){
            if(curr.next.key == key){return;}
            curr = curr.next;
        }
        curr.next = new ListNode(key);
    }
    
    public void remove(int key) {
        int index = key % this.size;
        ListNode curr = hashset[index];
        while(curr.next != null){
            if(curr.next.key == key){
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }
    }
    
    public boolean contains(int key) {
        int index = key % this.size;
        ListNode curr = hashset[index];
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

    public ListNode(){}

    public ListNode(int key){
        this.key = key;
        this.next = null;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */