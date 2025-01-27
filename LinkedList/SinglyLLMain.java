package LinkedList;

public class SinglyLLMain {
    public static void main(String[] args) {
        SinglyLL ll = new SinglyLL();
        ll.insertAtHead(4);
        ll.insertAtHead(2);
        ll.insertAtHead(1);
        ll.insertAtHead(3);
        ll.insertAtHead(7);

        ll.print(); // Output: 7 -> 3 -> 1 -> 2 -> 4 -> null
    }
}