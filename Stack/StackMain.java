package Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(3);
        stack.push(2);
        stack.push(7);
        stack.push(13);
        stack.push(15);
        
        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped: " + stack.pop());

        System.out.println("After popping,top element is: " + stack.peek());

        stack.push(17);
        System.out.println("New top element is: " +  stack.peek());
        
    }
}
