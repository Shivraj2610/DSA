public class MiddleNode {
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

    /*
     * Find Middle Node
     */
    public void findMiddle() {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("the Middle Node data is: " + slow.data);
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MiddleNode ll = new MiddleNode();
        ll.insertEnd(12);
        ll.insertEnd(13);
        ll.insertEnd(14);
        ll.insertEnd(15);
        ll.insertEnd(15);

        ll.display();
        ll.findMiddle();
    }
}
