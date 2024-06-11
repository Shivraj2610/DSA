public class AtAnyPosition {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void insertEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }

    // Insert at any Position
    public void insertMiddle(Node pre_node, int data) {

        try {

            if (pre_node.next == null) {
                return;
            }

            Node newNode = new Node(data);
            newNode.next = pre_node.next;
            pre_node.next = newNode;

        } catch (NullPointerException e) {
            System.out.println("Pre_node can not contain null value. Please input valid node");
            System.out.println(e);
        }

    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        AtAnyPosition ll = new AtAnyPosition();
        ll.insertEnd(10);
        ll.insertEnd(30);
        ll.insertEnd(109);
        Node pos = ll.head;
        ll.insertMiddle(pos, 100);

        ll.display();
    }
}
