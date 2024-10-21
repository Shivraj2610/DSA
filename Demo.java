import java.util.*;

class Tree {
    Node root = null;

    static class Node {
        int value;
        Node left;
        Node right;
        int height;

        Node(int value) {
            this.value = value;
            this.height = 1;
        }
    }

    // Calculate height
    public int height(Node node) {
        if (node == null) {
            return 0;
        }

        return node.height;
    }

    // Insertion into AVL tree
    public void insert(int value) {
        root = insert(value, root);
    }

    public Node insert(int value, Node node) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.value) {
            node.left = insert(value, node.left);
        }

        if (value > node.value) {
            node.right = insert(value, node.right);
        }

        node.height = 1 + Math.max(height(node.left), height(node.right));

        return rotate(node);
    }

    // Condition for Rotating Tree
    public Node rotate(Node node) {
        /*
         * if Left is heavy
         */
        if (height(node.left) - height(node.right) > 1) {
            // Left-Left Case
            if (height(node.left.left) - height(node.left.right) > 0) {
                return rightRotate(node);
            }
            // Left-Right Case
            if ((height(node.left.left) - height(node.left.right)) < 0) {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        /*
         * If Right is Heavy
         */
        if (height(node.left) - height(node.right) < -1) {
            // Right-Right Case
            if ((height(node.right.left) - height(node.right.right)) < 0) {
                return leftRotate(node);
            }

            // Right-Left Case
            if ((height(node.right.left) - height(node.right.right)) > 0) {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    /*
     * Right Rotation
     */
    public Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        // Rotate Right
        c.right = p;
        p.left = t;

        // Modify the change in height
        p.height = 1 + Math.max(height(p.left), height(p.right));
        c.height = 1 + Math.max(height(c.left), height(c.right));

        return c;
    }

    public Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;

        // Rotate Right
        p.left = c;
        c.right = t;

        // Modify the change in height
        c.height = 1 + Math.max(height(c.left), height(c.right));
        p.height = 1 + Math.max(height(p.left), height(p.right));

        return p;
    }

    public void bfs(Node node) {
        List<Integer> list = new ArrayList<>();
        int level = 1;

        while (bfs(list, level, node)) {
            level++;
        }

        System.out.println(list);
    }

    public boolean bfs(List<Integer> list, int level, Node node) {
        if (node == null) {
            return false;
        }

        if (level == 1) {
            list.add(node.value);
            return true;
        }

        boolean left = bfs(list, level - 1, node.left);
        boolean right = bfs(list, level - 1, node.right);

        return (left || right);
    }
}

public class Demo {
    public static void main(String[] args) {
        Tree t = new Tree();

        for (int i = 1; i <= 8; i++) {
            t.insert(i);
        }

        int h = t.height(t.root);
        System.out.println(h);
        System.out.println();
        t.bfs(t.root);
    }
}
