// package Questions;

public class ReverseLL2 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node() {
        }
    }

    /*
     * Insert at End
     */
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
            return;
        }
    }

    /*
     * Reverse Linked List 2 (Second version)
     */
    public Node reverseLL(Node head, int left, int right) {
        Node dummy = new Node();
        dummy.next = head;

        Node leftPrev = dummy;
        Node curr = head;
        int i = 1;
        while (i < left) {
            leftPrev = leftPrev.next;
            curr = curr.next;
            i++;
        }

        Node currHead = curr;

        Node prev = null;
        for (int j = 0; j <= right - left; j++) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        leftPrev.next = prev;
        currHead.next = curr;

        return dummy.next;
    }

    /*
     * Display Linked List
     */
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseLL2 ll = new ReverseLL2();

        ll.insertEnd(12);
        ll.insertEnd(13);
        ll.insertEnd(6);
        ll.insertEnd(18);
        ll.insertEnd(10);
        ll.insertEnd(100);
        ll.display();
        ll.reverseLL(ll.head, 2, 4);
        ll.display();
    }
}
