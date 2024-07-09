public class LinkedListDeletion {

    Node head;

    class Node {
        int data;
        Node next;

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

    public void deleteFirst() {
        head = head.next;
    }

    public void deleteEnd() {
        Node pretemp = head;
        Node temp = head.next;
        while (temp.next != null) {
            temp = temp.next;
            pretemp = pretemp.next;
        }
        pretemp.next = null;
    }

    public void deleteAny(int position) {
        int i = 0;
        Node temp = head;

        while (i < position - 1 && temp != null) {
            temp = temp.next;
            i++;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Not valid node");
            return;
        } else {
            temp.next = temp.next.next;

        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void detectCycle() {
        Node slow = head;
        Node fast = head;
        boolean flag = false;

        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("The Cycle is detected");
        } else {
            System.out.println("Cycle not detected");
        }
    }

    public static void main(String[] args) {
        LinkedListDeletion ll = new LinkedListDeletion();

        ll.insertAtEnd(12);
        ll.insertAtEnd(13);
        ll.insertAtEnd(10);
        ll.insertAtEnd(56);
        ll.insertAtEnd(32);
        ll.insertAtEnd(17);

        ll.display();

        // ll.deleteFirst();
        // ll.deleteEnd();
        // ll.deleteAny(7);
        ll.detectCycle();
        ;
        ll.display();
    }
}
