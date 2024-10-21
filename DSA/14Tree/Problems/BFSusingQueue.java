import java.util.List;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;

class Tree {
    Node root;

    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    // Insertion in BST
    public void insert(int[] arr) {
        for (int ele : arr) {
            this.root = insert(ele, this.root);
        }
    }

    public Node insert(int ele, Node node) {
        if (node == null) {
            return new Node(ele);
        }

        if (ele < node.val) {
            node.left = insert(ele, node.left);
        } else if (ele > node.val) {
            node.right = insert(ele, node.right);
        }

        return node;
    }

    // Display the Root
    public void display() {
        this.root = display(this.root, "");
    }

    private Node display(Node node, String p) {
        if (node == null) {
            return node;
        }

        display(node.left, p);
        System.out.print(p + node.val + " ");
        display(node.right, p);
        return node;
    }

    /*
     * Level Order Traversal (BFS)
     */
    public List<List<Integer>> bfs() {
        return bfs(this.root);
    }

    public List<List<Integer>> bfs(Node node) {
        List<List<Integer>> result = new ArrayList<>();
        if (node == null) {
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> curLevel = new ArrayList<>(levelSize);

            for (int i = 0; i < levelSize; i++) {
                Node curNode = queue.poll();
                curLevel.add(curNode.val);

                if (curNode.left != null) {
                    queue.offer(curNode.left);
                }
                if (curNode.right != null) {
                    queue.offer(curNode.right);
                }
            }

            result.add(curLevel);
        }

        return result;
    }
}

public class BFSusingQueue {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 7, 1, 8, 3, 9, 4 };
        Tree t = new Tree();
        t.insert(arr);
        t.display();

        List<List<Integer>> ans = t.bfs();
        System.out.println(ans);
    }
}
