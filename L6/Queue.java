public class Queue {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 8;

    Queue() {
        this(DEFAULT_CAPACITY);
    }

    Queue(int DEFAULT_CAPACITY) {
        elements = new int[DEFAULT_CAPACITY];
    }

    public void enqueue(int v) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = v;//รวบ size ++
    }

    public int dequeue() {
        int re = elements[0];
        System.arraycopy(elements, 1, elements, 0, elements.length-1);
        size --;
        return re;
    }

    public boolean empty() {
       return size == 0;//check true false
    }

    public int getSize() {
        return this.size;
    }
}
