import java.util.ArrayList;
import java.util.List;

class Tree {
    public Tree() {
    }

    private Node root = null;

    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }

        Node() {
        }

        public int getValue() {
            return value;
        }
    }

    // Insertion of BST
    public void insertion(int[] arr) {
        for (int ele : arr) {
            root = insertion(ele, root);
        }
    }

    /*
     * Logic of Insert Node in BST
     */
    Node insertion(int ele, Node node) {
        // if node is null then Insert the new Node and return back
        if (node == null) {
            node = new Node(ele);
            return node;
        }
        // Insert at left side
        if (ele < node.value) {
            node.left = insertion(ele, node.left);
        }

        // Insert at right side
        if (ele > node.value) {
            node.right = insertion(ele, node.right);
        }

        // go to previous node
        return node;
    }

    public void display() {

        List<Integer> ans = display(root);
        System.out.println(ans);
    }

    public List<Integer> display(Node node) {
        List<Integer> list = new ArrayList<>();
        if (node == null) {
            return list;
        }

        list.addAll(display(node.left));
        list.add(node.value);
        list.addAll(display(node.right));

        return list;
    }

}

public class Implementation {
    public static void main(String[] args) {
        Tree t = new Tree();
        t.insertion(new int[] { 5, 4, 7, 1, 8, 3, 9 });
        t.display();
    }
}
