
public class CreateTree {
    Node head;

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public void createTree(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        } else {
            Node temp = head;

            if (temp.left == null) {
                temp.left = newNode;
            } else if (temp.right == null) {
                temp.right = newNode;
            }
        }
    }

    public static void main(String[] args) {
        CreateTree ct = new CreateTree();
        ct.createTree(1);
    }
}
