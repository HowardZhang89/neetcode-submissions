class DynamicArray {

    int capacity;
    int size;
    int[] arr;

    public DynamicArray(int capacity) {

        this.arr = new int[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        this.arr[i] = n;
    }

    public void pushback(int n) {
        if(this.size >= this.capacity){
            resize();
        }
        this.arr[this.size] = n;
        this.size++;
    }

    public int popback() {
        this.size--;
        int result = this.arr[size];
        this.arr[size] = 0;
        return result;
    }

    private void resize() {
        int[] newArr = new int[this.capacity * 2];
        for(int i = 0; i < this.size; i++){
            newArr[i] = this.arr[i];
        }
        this.capacity *= 2;
        this.arr = newArr;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
