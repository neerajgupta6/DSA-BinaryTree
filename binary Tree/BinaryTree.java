class Node {
    int data;
    Node left, right;

    // Constructor
    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTree {
    Node root;

    // Inorder Traversal (Left, Root, Right)
    void inorder(Node node) {
        if (node == null)
            return;

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    // Main method
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Create the tree manually
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        // Output: 4 2 5 1 3
        System.out.print("Inorder traversal: ");
        tree.inorder(tree.root);
    }
}
