package LinkedList;

public class Node {
    private int data;
    private Node nextPointer;

    public Node(int data) {
        this.data = data;
        this.nextPointer = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNextPointer() {
        return nextPointer;
    }

    public void setNextPointer(Node nextPointer) {
        this.nextPointer = nextPointer;
    }
}