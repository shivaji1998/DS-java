package LinkedList;
/*
 A program implementing the following points:

1. Create a circular Linked List and implement
 -it using concepts of inbuilt classes and objects.

2. Implement the following functions:

1. Insert

2. Delete

3. Display the contents of linked list
*/

public class CLList {
        Node head, tail;
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    void insertElements(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }
    void displayElements() {
        Node n1 = head;
        if (tail == null && head == null) {
            System.out.println("cicular ll is empty,nothing to display");
        } else {
            do {
                System.out.println(n1.data );
                n1 = n1.next;

            } while (n1 != head);
        }
    }
        void deleteElements() {
            if (tail != head)
            {
                head = head.next;
                tail.next = head;
            } else {
                head = tail = null;
            }

        }

    public static void main(String[] args) {

        CLList list1 = new CLList();
        list1.insertElements(2);
        list1.insertElements(7);
        list1.insertElements(8);
        list1.displayElements();
        list1.deleteElements();
        list1.displayElements();






    }
}
