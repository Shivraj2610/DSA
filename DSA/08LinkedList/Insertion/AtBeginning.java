public class AtBeginning {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        AtBeginning ll = new AtBeginning();

        ll.insertFirst(10);
        ll.insertFirst(20);
        ll.insertFirst(1);
        ll.display();
    }
}
