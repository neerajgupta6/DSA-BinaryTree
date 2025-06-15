class Node {
    int data;
    Node left, right;

    // Constructor
    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class BinaryTree1 {
    Node root;

    // Inorder Traversal (Left, Root, Right)
    void inorder(Node node) {
        if (node == null)
            return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    // Preorder Traversal (Root, Left, Right)
    void preorder(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    // Postorder Traversal (Left, Right, Root)
    void postorder(Node node) {
        if (node == null)
            return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    // Main method
    public static void main(String[] args) {
        BinaryTree1 tree = new BinaryTree1();

        

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.print("Inorder traversal: ");
        tree.inorder(tree.root);      // Output: 4 2 5 1 3
        System.out.println();

        System.out.print("Preorder traversal: ");
        tree.preorder(tree.root);     // Output: 1 2 4 5 3
        System.out.println();

        System.out.print("Postorder traversal: ");
        tree.postorder(tree.root);    // Output: 4 5 2 3 1
        System.out.println();
    }
}
