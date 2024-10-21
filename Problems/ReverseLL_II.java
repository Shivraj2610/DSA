public class ReverseLL_II {
    Node head = null;

    class Node {
        int data;
        Node next;

        Node() {
        }

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void displayLL(Node point) {
        Node temp = point;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public Node reverse(Node head, int l, int r) {
        // Creat a dummy node
        Node dummy = new Node(0);
        dummy.next = head;

        // Make two refferences one is LeftPre and one is curr

        Node leftPrev = dummy;
        Node curr = head;
        int pos = 1;
        /*
         * leftPre point to previous of left(l) node
         * and curr point to the left(l) node
         */
        while (pos < l) {
            leftPrev = leftPrev.next;
            curr = curr.next;
            pos++;
        }

        /*
         * Now Reverse the LinkedList l to r
         */

        Node tempHead = curr;// Point to left node(l)
        Node prev = null;// Used to reverse LL
        for (int i = 0; i <= r - l; i++) {
            Node nextNode = curr.next;

            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        leftPrev.next = prev;
        tempHead.next = curr;

        return dummy.next;
    }

    public static void main(String[] args) {
        ReverseLL_II rl = new ReverseLL_II();
        rl.insertAtEnd(1);
        rl.insertAtEnd(2);
        rl.insertAtEnd(3);
        rl.insertAtEnd(5);
        rl.insertAtEnd(6);
        rl.displayLL(rl.head);

        Node first = rl.reverse(rl.head, 2, 4);
        rl.displayLL(first);
    }
}
