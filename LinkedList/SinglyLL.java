package LinkedList;

public class SinglyLL {
    private Node head;

    public SinglyLL() {
        this.head = null;
    }

    // Insert at the beginning of the list
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.setNextPointer(head);
        head = newNode;
    }

    // Print the linked list
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " -> ");
            current = current.getNextPointer();
        }
        System.out.print("null");
    }
}