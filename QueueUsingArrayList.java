import java.util.ArrayList;
public class QueueUsingArrayList {
    private ArrayList<Integer> queue;
    public QueueUsingArrayList() {
        queue = new ArrayList<>();
    }
    public void enqueue(int value) {
        queue.add(value);
    }
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.remove(0);
    }
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.get(0);
    }
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    public int size() {
        return queue.size();
    }
    public static void main(String[] args) {
        QueueUsingArrayList queue = new QueueUsingArrayList();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Peek: " + queue.peek());
        System.out.println("Size: " + queue.size());
    }
}