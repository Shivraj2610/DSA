public class LinkedListInsertions {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void atEnd(int data) {
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

    public void atBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void atAnyPosition(int data, int position) {
        Node newNode = new Node(data);

        int i = 0;
        Node temp = head;

        while (i < position - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
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
        LinkedListInsertions ll = new LinkedListInsertions();

        ll.atEnd(12);
        ll.atEnd(23);
        ll.display();
        ll.atBeginning(15);
        ll.display();
        ll.atAnyPosition(17, 2);
        ll.display();
    }
}
