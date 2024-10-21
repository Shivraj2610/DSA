
class SegmentTree {
    Node root;

    static class Node {
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    // Construct the Segment Tree
    public Node constructTree(int[] arr, int start, int end) {
        if (start == end) {
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        // Create new Node with Range between indexes
        Node node = new Node(start, end);

        // Divide the Array
        int mid = (start + end) / 2;
        // Recursive call
        node.left = constructTree(arr, start, mid);
        node.right = constructTree(arr, mid + 1, end);

        node.data = node.left.data + node.right.data;

        return node;
    }

    /*
     * Find the Sum for the Query Interval
     */
    public void query(int qsi, int qei) {
        int sum = query(this.root, qsi, qei);
        System.out.println(sum);
    }

    public int query(Node node, int qsi, int qei) {
        if (node == null) {
            return 0;
        }

        // Node Interval is inside Query interval
        if (node.startInterval >= qsi && node.endInterval <= qei) {
            return node.data;
            // Node Interval is completly outside Interval
        } else if (node.startInterval > qei || node.endInterval < qsi) {
            return 0;
            // Overlapping node Intervals and Query Intervals
        } else {
            // Recursive Call
            int left = query(node.left, qsi, qei);
            int right = query(node.right, qsi, qei);

            return left + right;
        }
    }

    /*
     * Update the Index in Array
     */
    public int update(int index, int value) {
        this.root.data = update(this.root, index, value);
        return this.root.data;
    }

    private int update(Node node, int index, int value) {
        // Check the index is lies between the intervals
        if (index >= node.startInterval && index <= node.endInterval) {
            // If Match given index as leaf node then update the value
            if (index == node.startInterval && index == node.endInterval) {
                node.data = value;
                return node.data;
                // Else Split to find the index
            } else {
                int leftAns = update(node.left, index, value);
                int rightAns = update(node.right, index, value);
                node.data = leftAns + rightAns;
                return node.data;
            }
        }
        return node.data;
    }

}

public class Implementation {
    public static void main(String[] args) {

        int[] arr = { 5, 3, 2, 7, 1, 4 };

        SegmentTree st = new SegmentTree();
        // Function call for construct Segment Tree
        st.root = st.constructTree(arr, 0, arr.length - 1);

        // Find the Sum between index range 2 to 3
        System.out.println("The Sum from index 2 to 3 is:");
        st.query(2, 3);

        System.out.println("The Sum from index 0 to 5 is:");
        st.query(0, 5);

        System.out.println("The Sum after Updating index number 3 as 10: ");
        int updateAns = st.update(3, 10);
        System.out.println(updateAns);
    }
}
