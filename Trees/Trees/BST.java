package Trees;

public class BST {
    private Node root;

    public BST() {
        root = null;
    }

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node node, int data) {
        if (node == null) {
            return new Node(data); 
        }

        if (data < node.data) {
            node.left = insertRec(node.left, data); 
        } else if (data > node.data) {
            node.right = insertRec(node.right, data); 
        }

        return node; 
    }

    public void remove(int data){
        root = removeRec(root, data);

    }
    private Node removeRec(Node node, int data){
        if(node == null){
            return null;
        }

        //search for node
        if(data < node.data){
            node.left = removeRec(node.left, data);
        }
        else if(data>node.data){
            node.right = removeRec(node.right, data);
        }
        else{

            //Case 1: leaf node
            if(node.left == null && node.right==null){
                return null;
            }
            
            //Case2: Node is missing one child
            if(node.left ==null){
                return node.right;
            }
            if(node.right==null){
                return node.left;
            }

            //Case3: Node has both children, get leftmost right subtree
           node.data = findMin(node.right);
           node.right = removeRec(node.right, node.data);

        }
            return node;
    }


    private int findMin(Node node){

        while(node.left != null){
            node = node.left;
        }
        
        return node.data;
    }



    public void printTree() {
        printTreeRec(root, 0);
    }

    private void printTreeRec(Node node, int level) {
        if (node == null) {
            return;
        }

       
        printTreeRec(node.right, level + 1);

       
        for (int i = 0; i < level; i++) {
            System.out.print("    ");
        }

        System.out.println(node.data);

        printTreeRec(node.left, level + 1);
    }
}