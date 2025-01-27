

public class LinearQueue {
    private int[] queue;
    private int front,rear,capacity;

    public LinearQueue(int size){
        queue = new int[size];
        capacity=size;
        front = rear=-1;
    }

    //cant peek if empty
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }
    //cant enqueue if full
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        if(isEmpty()){
            front=0;
        }
        queue[++rear] = data;
    }
    //cant dequeue if empty
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int data = queue[front];

        if(front == rear){
            front = rear = -1;
        }
        else{
            front++;
        }

        return data;
    }

    public boolean isFull(){
        return rear == capacity-1;
    }
    public boolean isEmpty(){
        return front == -1;
    }
    

}
