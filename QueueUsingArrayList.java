import java.util.ArrayList;
public class QueueUsingArrayList {
    private ArrayList<Integer> queue;
    public QueueUsingArrayList() {
        queue = new ArrayList<>();
    }
    public void enqueue(int data) {
        queue.add(data);
        System.out.println(data + " added to the queue.");
    }
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; 
        }
        int removedElement = queue.remove(0);
        System.out.println(removedElement + " removed from the queue.");
        return removedElement;
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to peek.");
            return -1; 
        }
        return queue.get(0);
    }
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue elements: " + queue);
        }
    }
    public static void main(String[] args) {
        QueueUsingArrayList queue = new QueueUsingArrayList();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();
        queue.dequeue();
        queue.display();
        System.out.println("Front element: " + queue.peek());
        queue.display();
    }
}
