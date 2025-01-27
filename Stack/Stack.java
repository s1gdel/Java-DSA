package Stack;

public class Stack {
    private int[] stack;
    private int top;
    private int capacity;

    public Stack(int size){
        stack=new int[size];
        top=-1;
        capacity=size;
    }

    //cant push if full
    public void push(int number){
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = number;
    }

    //cant pop if empty
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        } 
        return stack[top--];
    }

    //cant peek if empty
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }
    public boolean isFull(){
        return top == capacity-1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
}
