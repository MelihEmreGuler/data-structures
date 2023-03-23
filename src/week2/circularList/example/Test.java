package week2.circularList.example;

public class Test {
    public static void main(String[] args) {
        CircularList list = new CircularList();

        list.insert(2);
        list.insert(4);
        list.insert(6);

        list.orderlyInsert(8);

        list.delete(4);

        list.print();
    }
}