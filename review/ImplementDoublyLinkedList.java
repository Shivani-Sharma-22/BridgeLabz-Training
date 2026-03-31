package review;
import java.util.*;
class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
class DoublyLinkedList {
    Node head;

    public void addAtBeginning(int data) {
        Node newNode = new Node(data);

        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }

    public void remove(int data) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == data) {

                if (temp.prev != null)
                    temp.prev.next = temp.next;
                else
                    head = temp.next;

                if (temp.next != null)
                    temp.next.prev = temp.prev;

                return;
            }
            temp = temp.next;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class ImplementDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.addAtBeginning(3);
        dll.addAtBeginning(2);
        dll.addAtBeginning(1);

        dll.display();

        dll.remove(2);
        dll.display();
    }
}

