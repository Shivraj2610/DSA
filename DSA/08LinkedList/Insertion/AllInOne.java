import java.util.*;

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

    // Insert At End
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        // For Empty Linked List
        if (head == null) {
            head = newNode;
            return;
        }

        // For Non-Empty Linked List
        newNode.next = null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }

    // Insert At First
    public void insertAtFirst(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    // Insert At any position
    public void inseAtMiddle(int position, int data) {
        Node newNode = new Node(data);

        Node temp = head;
        int i = 1;

        while (i < position) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Insert at next of any node
    public void insertToNode(Node preNode, int data) {
        try {

            Node newNode = new Node(data);

            newNode.next = preNode.next;
            preNode.next = newNode;

        } catch (NullPointerException e) {
            System.out.println("Please enter valid node which dont have null at next");
            System.out.println(e);
        }
    }

    // Display Linked List
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        AllInOne ll = new AllInOne();
        System.out.println(
                "1--> Insert At First\n2--> Insert At End\n3--> Insert at any position\n4-->Display Linked List");
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        while (flag) {
            System.out.println("Choose your choice");

            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("You Exit");
                    flag = false;
                    break;
                case 1:
                    System.out.println("Enter data in Linked List at First");
                    int data = sc.nextInt();
                    ll.insertAtFirst(data);
                    break;

                case 2:
                    System.out.println("Enter data in Linked List at End");
                    int data1 = sc.nextInt();
                    ll.insertAtEnd(data1);
                    break;

                case 3:
                    System.out.println("Enter data in Linked List at any position");
                    int data2 = sc.nextInt();
                    System.out.println("Enter position of linked list");
                    int position = sc.nextInt();
                    ll.inseAtMiddle(position, data2);
                    break;

                case 4:
                    System.out.println("The Linked List is:");
                    // ll.insertToNode(ll.head.next, 100);
                    ll.display();
                    break;

                default:
                    System.out.println("Please choose valid choice");
                    break;
            }
        }
        sc.close();
    }
}
