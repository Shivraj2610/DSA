
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class HightofTree {

    public int findHeight(Node root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(findHeight(root.left), findHeight(root.right));
    }

    public static void main(String[] args) {
        HightofTree ht = new HightofTree();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

        int ans = ht.findHeight(root);
        System.out.println(ans);
    }
}
