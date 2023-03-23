package week3.doublyLinkedList.example;

public class DoublyLinkedList {
    Node root;

    void Insert(int data) { //insert to and of the list
        Node newNode = new Node(data);
        if (this.root == null) { //if the list is empty
            this.root = newNode;
        } else {
            Node lastNode = findLastNode();
            lastNode.next = newNode;
            newNode.previous = lastNode;
        }
    }

    void orderlyInsert(int data) {
        Node newNode = new Node(data);

        if (this.root == null) {
            this.root = newNode;
        } else if (newNode.data < this.root.data) {//if the new node smaller than root
            //changing the root
            newNode.next = this.root;
            newNode.previous = null;

            this.root.previous = newNode;
            this.root = newNode;

        } else { //the new node is equal or bigger than root
            Node iter = this.root;

            while (iter.next != null && iter.next.data < newNode.data) {
                iter = iter.next;
            }

            Node temporary = iter.next;
            iter.next = newNode;
            newNode.previous = iter;
            newNode.next = temporary;
                //if our new node is bigger than from all the elements, temp will be null and a null has not a previous field
            if (temporary != null) {
                temporary.previous = newNode;
            }
        }
    }
    public void delete(int data) { //this function created from chat gpt with comments. it is perfect!
        Node current = root;

        // Search for the node with the given data
        while (current != null && current.data != data) {
            current = current.next;
        }

        // If the node is not found, print an error message and return
        if (current == null) {
            System.out.println("The data you are looking for does not exist!");
            return;
        }

        // If the node is the root node, update the root
        if (current == root) {
            root = current.next;
            // If the new root is not null, set its previous pointer to null
            if (root != null) {
                root.previous = null;
            }
        } else if (current.next == null) {
            // If the node is the last node, update the previous node's next pointer to null
            current.previous.next = null;
        } else {
            // If the node is not the root node or the last node, update the previous node's next pointer
            current.previous.next = current.next;
            // Update the next node's previous pointer
            current.next.previous = current.previous;
        }
    }

    void print() {
        Node iter = this.root;

        System.out.print("print: ");
        while (iter != null) {
            System.out.print(iter.data + " ");
            iter = iter.next;
        }
        System.out.println();
    }

    void printReverse() {
        Node iter = findLastNode();

        System.out.print("reverse print: ");
        while (iter != null) {
            System.out.print(iter.data + " ");
            iter = iter.previous;
        }
        System.out.println();
    }

    private Node findLastNode() {
        Node iter = this.root;
        while (iter.next != null) {
            iter = iter.next;
        }
        return iter;
    }

}
