
public class QueueWthArray {
    static int[] queue = new int[5];
    static int front = 0, rear = -1;
    static void enqueue(int value) {
        if (rear == queue.length - 1) {
            System.out.println("Queue Full");
            return;
        }
        queue[++rear] = value;
    }
    static void dequeue() {
        if (front > rear) {
            System.out.println("Queue Empty");
            return;
        }
        System.out.println("Removed: " + queue[front++]);
    }
    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        dequeue();
        dequeue();
    }
}
