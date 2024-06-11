class AnyWhere {

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

    public void anyPosition(int Position, int data) {
        Node newNode = new Node(data);
        int i = 1;
        Node temp = head;

        while (i < Position) {
            temp = temp.next;
            i++;
            if (temp.next == null) {
                System.out.println("Please Enter valid position");
                return;
            }
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
    }

    public static void main(String[] args) {
        AnyWhere ll = new AnyWhere();
        ll.insertFirst(10);
        ll.insertFirst(20);
        ll.insertFirst(30);
        ll.anyPosition(3, 17);
        ll.display();
    }
}