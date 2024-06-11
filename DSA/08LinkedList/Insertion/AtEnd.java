
public class AtEnd {
    Node head;

    // Creating Node
    class Node {
        int data;
        Node nextPtr;

        Node(int data) {
            this.data = data;
            nextPtr = null;
        }
    }

    // Implementation of Inserting a Node at End
    public void insertAtEnd(int newData) {
        Node newNode = new Node(newData);

        // Linked List is Empty
        if (head == null) {
            head = new Node(newData);
            return;
        }

        // Linked List is Not-Empty
        newNode.nextPtr = null;
        Node temp = head;
        while (temp.nextPtr != null) {
            temp = temp.nextPtr;
        }
        temp.nextPtr = newNode;
        return;
    }

    // Implementation of Displaying Linked List
    public void displayLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.nextPtr;
        }
    }

    public static void main(String[] args) {
        AtEnd ll = new AtEnd();
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(5);

        ll.displayLL();
    }
}
