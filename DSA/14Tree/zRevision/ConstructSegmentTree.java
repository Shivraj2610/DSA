class SegmentTree {
    Node root = null;

    class Node {
        int low;
        int high;
        int val;
        Node left;
        Node right;

        public Node(int low, int high) {
            this.low = low;
            this.high = high;
        }
    }

    public Node creation(int[] arr, int low, int high) {
        // Base Condition we reach to leaf node
        if (low == high) {
            Node leaf = new Node(low, high);
            leaf.val = arr[low];
            return leaf;
        }

        // Create a new Node to store the intervals
        Node node = new Node(low, high);
        // Divide the Array
        int mid = (low + high) / 2;

        // Recursive call
        node.left = creation(arr, low, mid);
        node.right = creation(arr, mid + 1, high);

        node.val = node.left.val + node.right.val;

        return node;
    }

    public void display(Node node) {
        if (node == null) {
            return;
        }

        display(node.left);
        System.out.print(node.val + " ");
        display(node.right);
    }
}

public class ConstructSegmentTree {

    public static void main(String[] args) {
        int[] arr = { 4, 1, 6, 2, 9, 2 };
        SegmentTree st = new SegmentTree();

        st.root = st.creation(arr, 0, arr.length - 1);
        st.display(st.root);
    }
}