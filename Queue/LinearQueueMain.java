

public class LinearQueueMain {
    public static void main(String[] args) {
        LinearQueue queue = new LinearQueue(5);
        queue.enqueue(1);
        queue.enqueue(5);
        queue.enqueue(6);

        System.out.println("Front of queue is : " + queue.peek());
        
        System.out.println("Dequeued: " +  queue.dequeue());

        System.out.println("New Front of queue is : " + queue.peek());

        System.out.println("Front of queue is : " + queue.peek());
    }
}
