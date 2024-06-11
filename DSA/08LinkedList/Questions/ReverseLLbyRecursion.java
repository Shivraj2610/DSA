public class ReverseLLbyRecursion {
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
     * Insert data at First Position of LL
     */
    public void insertFirst(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    /*
     * Reverse a Linked List
     */
    public void reverseLL(Node curr, Node prev) {
        // Base case
        if (curr.next == null) {
            head = curr;
            curr.next = prev;
            return;
        } else {
            Node nextptr = curr.next;
            curr.next = prev;

            // Recursive function call
            reverseLL(nextptr, curr);
            return;
        }
    }

    /*
     * Display LL
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
        ReverseLLbyRecursion ll = new ReverseLLbyRecursion();

        ll.insertFirst(5);
        ll.insertFirst(4);
        ll.insertFirst(3);
        ll.insertFirst(2);
        System.out.println("LL before Reversing");
        ll.display();
        ll.reverseLL(ll.head, null);
        System.out.println("LL after Reversing");
        ll.display();
    }
}
