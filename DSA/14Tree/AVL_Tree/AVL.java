class Tree {
    Node root = null;

    static class Node {
        int value;
        Node left;
        Node right;
        int height;

        Node(int value) {
            this.value = value;
            this.height = 0;
        }
    }

    // Tell us the height of Node
    public int height(Node node) {
        if (node == null) {
            return 0;
        }

        return node.height;
    }

    // Insertion operation
    public void insert(int value) {
        root = insert(value, root);
    }

    public Node insert(int value, Node node) {
        if (node == null) {
            return new Node(value);
        }

        // Condition for BST
        if (value <= node.value) {
            node.left = insert(value, node.left);
        } else if (value > node.value) {
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return rotate(node);
    }

    // Tree Rotation
    public Node rotate(Node node) {
        // Left Heavy
        if (height(node.left) - height(node.right) > 1) {
            // Left-Left Case
            if (height(node.left.left) > height(node.left.right)) {
                return rightRotate(node);
            } else {// Left-Right Case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        // Right Heavy
        if (height(node.right) - height(node.left) > 1) {
            // Right-Right Case
            if (height(node.right.right) > height(node.right.left)) {
                return leftRotate(node);
            } else {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }

    // Right Rotation
    public Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        // Rotate to Left side
        c.right = p;
        p.left = t;

        // Modify Changes in height
        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return c;
    }

    // Left Rotation
    public Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;

        // Rotate to Left side
        p.left = c;
        c.right = t;

        // Modify Changes in height
        c.height = Math.max(height(c.left), height(c.right)) + 1;
        p.height = Math.max(height(p.left), height(p.right)) + 1;

        return p;
    }
}

public class AVL {
    public static void main(String[] args) {
        Tree t = new Tree();

        for (int i = 1; i < 10; i++) {
            t.insert(i);
        }

        System.out.println(t.height(t.root));
    }
}