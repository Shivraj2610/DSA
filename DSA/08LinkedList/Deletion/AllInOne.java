
public class AllInOne {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void insertAtEnd(int data) {
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

    // Deletion data at First position
    public void deleteFirst() {
        if (head == null) {
            return;
        }
        Node temp = head;
        head = temp.next;
        return;
    }

    // Deletion at perticular position
    public void deleteAnyPosition(int position) {
        Node temp = head;
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
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

    public static void main(String[] args) {
        AllInOne ll = new AllInOne();

        ll.insertAtEnd(12);
        ll.insertAtEnd(13);
        ll.insertAtEnd(17);
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);
        ll.display();
        ll.deleteFirst();
        ll.display();
        ll.deleteAnyPosition(2);
        ll.display();
    }
}