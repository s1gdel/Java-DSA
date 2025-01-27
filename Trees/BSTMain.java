package Trees;

public class BSTMain {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(25);
        bst.insert(7);
        bst.insert(40);
        bst.insert(51);
        bst.insert(4);
        bst.insert(2);
        bst.insert(14);
        bst.insert(6);

        System.out.println("Visual Representation of the BST:");
        bst.printTree();

        bst.remove(7);

        System.out.println("Visual Representation of the BST:");
        bst.printTree();


    }
}