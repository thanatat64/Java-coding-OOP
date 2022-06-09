public class Pro4 {
    public static void main(String[] args) {
        Queue q = new Queue();
        for (int i = 1; i <= 20; i++) {
            q.enqueue(i);
        }
        while (!q.empty()) {
            System.out.println(q.dequeue());
        }
    }
}
