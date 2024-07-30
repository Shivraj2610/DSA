class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class Bfs {
    public static boolean helper(Node root, int level) {
        if (root == null) {
            return false;
        }
        if (level == 1) {
            System.out.print(root.data + " ");
            return true;
        }

        boolean left = helper(root.left, level - 1);
        boolean right = helper(root.right, level - 1);

        return (left || right);
    }

    public void printLevelWise(Node root) {
        int level = 1;
        while (helper(root, level)) {
            level++;
        }
    }

    public static void main(String[] args) {
        Bfs bf = new Bfs();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

        bf.printLevelWise(root);
    }
}
