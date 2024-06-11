public class CycleDetection {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /*
     * Cyclic Linked List
     */
    public void insertEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        } else {
            // newNode.next = head;
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
            return;
        }
    }

    // Cycle Detection in Linked List
    public void cycleDetection() {
        Node slow = head;
        Node fast = head;
        int flag = 0;

        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                flag = 1;
                break;
            }
        }

        if (flag == 0) {
            System.out.println("Not Cycle Detection");
        } else {
            System.out.println("Cycle is Detected");
        }
    }

    // Display Linked List
    public void display() {
        Node temp = head;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }

    public static void main(String[] args) {
        CycleDetection ll = new CycleDetection();

        ll.insertEnd(12);
        ll.insertEnd(13);
        ll.insertEnd(1);
        ll.insertEnd(7);
        ll.display();
        // Node temp = ll.head;
        // while (temp.next != null) {
        // temp = temp.next;
        // }
        // temp.next = ll.head;

        ll.cycleDetection();
    }
}
