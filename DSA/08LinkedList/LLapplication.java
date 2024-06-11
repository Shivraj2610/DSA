import java.util.*;

public class LLapplication {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // Insert at End
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        // if LL is Empty
        if (head == null) {
            head = newNode;
            return;
        }

        // if LL is Non-Empty
        newNode.next = null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }

    // Insert at First
    public void insertAtFirst(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    // Inser at any position
    public void insertAny(int position, int data) {
        Node newNode = new Node(data);
        int i = 0;
        Node temp = head;

        while (i < position - 1) {
            temp = temp.next;
            i++;

            if (temp.next == null) {
                System.out.println("Please Enter valid Position");
            }
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Deletion of First Node
    public void deleteFirst() {

        if (head == null) {
            return;
        }
        Node temp = head;
        head = temp.next;
    }

    // Deletion of Any Positon
    public void deleteAny(int position) {
        Node temp = head;
        for (int i = 0; temp != null && i < position - 1; i++) {
            if (temp == null || temp.next == null) {
                System.out.println("Enter valid position to delete node");
                return;
            } else {
                temp.next = temp.next.next;
            }
        }
    }

    // Display Linked List
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LLapplication ll = new LLapplication();
        boolean flag = true;
        System.out.println(
                "0-->Exit from here\n1-->Inserting data in Linked List\n2-->Deleting data from Linked List\n3-->To Display Linked List");

        while (flag) {
            // Activity Region
            System.out.println("Choose activity");
            int choice = sc.nextInt();

            switch (choice) {
                case 0:
                    flag = false;
                    System.out.println("You are Exit form application");
                    break;

                case 1:
                    // Insertion Region
                    System.out.println(
                            "0-->Exit from Inserition region\n1-->Insert At Beginning\n2-->Insert at End\n3-->Insert at any position");

                    boolean flag1 = true;
                    while (flag1) {
                        System.out.println("Choose your Insertion type");
                        int num = sc.nextInt();

                        switch (num) {
                            case 0:
                                System.out.println("You Exit form Insertion Region");
                                flag1 = false;
                                break;

                            case 1:
                                System.out.println("Enter data to add in Linked List");
                                int data = sc.nextInt();
                                ll.insertAtFirst(data);
                                break;

                            case 2:
                                System.out.println("Enter data to add in Linked List");
                                int data1 = sc.nextInt();
                                ll.insertAtEnd(data1);
                                break;

                            case 3:
                                System.out.println("Enter data");
                                int data2 = sc.nextInt();
                                System.out.println("Enter position where you want to add data");
                                int position = sc.nextInt();
                                ll.insertAny(position, data2);
                                break;

                            default:
                                System.out.println("Please choose valid choice");
                                break;
                        }
                    }
                    break;

                case 2:
                    // Deletion Region
                    System.out.println(
                            "0-->Exit from Deletion region\n1-->Deletion of first Node\n2-->Deletion of Last node");
                    boolean flag2 = true;

                    while (flag2) {
                        System.out.println("Choose your Deletion Type");
                        int type = sc.nextInt();

                        switch (type) {
                            case 0:
                                flag2 = false;
                                System.out.println("You Exit from Deletion region");
                                break;

                            case 1:
                                ll.deleteFirst();
                                System.out.println("Deletion of First Node is Successfuly");
                                break;

                            case 2:
                                System.out.println("Enter the Postion for deleting Node");
                                int pos = sc.nextInt();
                                ll.deleteAny(pos);
                                System.out.println("The Node at position " + pos + " is deleted successfuly");
                                break;

                            default:
                                break;
                        }
                    }
                    break;

                case 3:
                    System.out.println("The Linked List is:");
                    ll.display();
                    break;

                default:
                    System.out.println("Please choose valid choice");
                    break;
            }
        }
    }
}
