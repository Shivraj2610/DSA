public class FindLength {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        } else {

            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    /*
     * Find the Length of Linked List
     */
    public void findLenght(Node head) {
        int length = 0;

        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        System.out.println(length);
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
        FindLength ll = new FindLength();

        ll.insertEnd(12);
        ll.insertEnd(14);
        ll.insertEnd(16);
        ll.insertEnd(18);
        ll.display();
        ll.findLenght(ll.head);
    }
}
