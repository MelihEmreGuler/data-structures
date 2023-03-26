package week3.doublyLinkedList.homework;

import java.util.Random;

public class DoublyCircularList {
    Node root;


    void orderlyInsert(int data) {
        Node newNode = new Node(data);

        if (root == null) { // if the list is empty, make the new node the root
            root = newNode;
            root.next = newNode;
            root.previous = newNode;

        } else {
            Node current = root;
            while (current.next != root && current.next.data < data) { // finding the previous position to insert the new node
                current = current.next;
            }
            newNode.next = current.next;
            newNode.previous = current;
            current.next.previous = newNode;
            current.next = newNode;

            if (newNode.data < root.data) { // if the new node is smaller than the root, make it the new root
                root = newNode;
            }
        }
    }

    public void addRandom100Elements() {
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            int data = rand.nextInt(100) + 1; // generate a random integer between 1 and 100
            orderlyInsert(data);
        }
    }

    void print() {
        Node current = root;

        if (current == null) {
            System.out.println("Nothing to print. The list is empty.");
            return;
        } else {
            System.out.print("list: ");
            do {
                System.out.print(current.data + " ");
                current = current.next;
            } while (current != root);

            System.out.println();
        }
    }
}
