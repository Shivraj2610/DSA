import java.util.Scanner;

class Tree {

    void Tree() {
    }

    Node root = null;

    public static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }

        Node() {
        }
    }

    // Insert Data into a Binary Tree
    public void insertRoot(Scanner sc) {
        System.out.println("Insert Value for Root: ");
        int value = sc.nextInt();

        // Store value in Root node
        root = new Node(value);

        // For Insert other Node's data
        insert(sc, root);
    }

    public void insert(Scanner sc, Node node) {
        System.out.println("You want to add Node to left of: " + node.value);
        boolean left = sc.nextBoolean();

        if (left) {
            System.out.println("Enter value: ");
            int value = sc.nextInt();
            node.left = new Node(value);
            // Reursive call
            insert(sc, node.left);
        }

        System.out.println("Do you wnat to add Node right to: " + node.value);
        boolean right = sc.nextBoolean();

        if (right) {
            System.out.println("Enter value: ");
            int value = sc.nextInt();
            node.right = new Node(value);

            // Recursive Call
            insert(sc, node.right);
        }
    }

    public void display() {
        System.out.println("The InOrder is:");
        inOrder(root, "");
        System.out.println();
        System.out.println("The PreOrder is:");
        preOrder(root, "");

        System.out.println();
        System.out.println("The PreOrder is:");
        postOrder(root, "");
    }

    public void inOrder(Node node, String p) {
        if (node == null) {
            return;
        }

        System.out.print(p + node.value);
        inOrder(node.left, p + " ");
        inOrder(node.right, p + " ");
    }

    public void preOrder(Node node, String p) {
        if (node == null) {
            return;
        }

        preOrder(node.left, p + " ");
        System.out.print(p + node.value);
        preOrder(node.right, p + " ");
    }

    public void postOrder(Node node, String p) {
        if (node == null) {
            return;
        }

        postOrder(node.left, p + " ");
        postOrder(node.right, p + " ");
        System.out.print(p + node.value);
    }
}

public class Implementation {
    public static void main(String[] args) {
        Tree t = new Tree();
        t.insertRoot(new Scanner(System.in));
        t.display();
    }
}
