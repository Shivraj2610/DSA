
public class ReverseLLbyIteratively {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    /*
     * Insertion data at End
     */
    public void insertEnd(int data) {
        Node newNode = new Node(data);

        // If LL is Empty
        if (head == null) {
            head = newNode;
            return;
        }

        // LL is Not-Empty
        newNode.next = null;
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }

    /*
     * Reverse LL by Iteratively
     */
    public void reverseLL() {
        Node curr = head;
        Node prev = null;
        Node nextPtr = null;

        while (curr != null) {
            nextPtr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextPtr;
        }
        head = prev;
        return;
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
        ReverseLLbyIteratively ll = new ReverseLLbyIteratively();

        ll.insertEnd(2);
        ll.insertEnd(4);
        ll.insertEnd(6);
        ll.insertEnd(8);
        ll.insertEnd(10);

        System.out.println("The Normal Linked List is:");
        ll.display();

        ll.reverseLL();
        System.out.println("The Linked List after Reversing is:");
        ll.display();
    }
}
