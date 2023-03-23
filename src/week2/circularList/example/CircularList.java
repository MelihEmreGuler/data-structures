package week2.circularList.example;

public class CircularList {
    Node root;

    void insert(int data){
        if (this.root == null){ //if the list is empty
            this.root = new Node(data);
            this.root.next = this.root;
        }else {
            Node iter = this.root;
            while (iter.next != this.root) {
                iter = iter.next;
            }
            Node newNode = new Node(data);
            iter.next = newNode;
            newNode.next = this.root;
        }
    }

    void orderlyInsert(int data){
        Node newNode = new Node(data);

        if (this.root == null){ // if the list is empty
            this.root = newNode;
            this.root.next = this.root; // the root of a single-element list, points to itself

        } else if (newNode.data < this.root.data) { //if the new node is smaller than root

            Node iter = this.root;
            while (iter.next != this.root){
                iter = iter.next;
            }
            iter.next = newNode;
            newNode.next =this.root;
            this.root = newNode;

        } else { //if the new node is equal or bigger than root

            Node iter = this.root;
            while (newNode.data > iter.next.data && iter.next != this.root){ //if big and different from the root
                iter = iter.next;
            }
            // adding between two nodes
            Node temporary = iter.next;
            iter.next =newNode;
            iter.next.next = temporary;
        }
    }

    void delete(int data){
        Node iter = this.root;

        if(this.root.data == data){ //if it is the first element

            while (iter.next != this.root){ //find the last element
                iter = iter.next;
            }
            iter.next = this.root.next; // the old root deleted
            this.root = this.root.next;
        }else {
            while (iter.next.data != data && iter.next != this.root){
                iter = iter.next;
            }

            if (iter.next.data != data){// my mistake -> iter.next != this.root
                System.out.print("The data you are looking for does not exist! \n");
            }else {// the data we are looking for to delete is in the list
                iter.next = iter.next.next;
            }
        }
    }

    void print(){

        Node iter = this.root;
        System.out.print(iter.data + " ");
        iter = iter.next;
        while (iter != this.root){
            System.out.print(iter.data + " ");
            iter = iter.next;
        }
        System.out.print("\n");
    }
}
