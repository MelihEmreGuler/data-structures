package week3.doublyLinkedList.example;

public class Test {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.Insert(4);
        list.Insert(5);
        list.Insert(6);

        list.orderlyInsert(2);
        list.orderlyInsert(3);
        list.orderlyInsert(7);

        list.delete(7);
        list.delete(2);
        list.delete(4);

        list.print();
        list.printReverse();
    }
}
