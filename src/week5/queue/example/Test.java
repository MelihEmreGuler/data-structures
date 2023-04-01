package week5.queue.example;

public class Test {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enQueue(3);
        queue.enQueue(6);
        queue.enQueue(9);
        queue.enQueue(12);
        queue.enQueue(15);
        queue.enQueue(20);

        System.out.println("your queue;");
        queue.print();

        int removedValue = queue.deQueue();
        System.out.println("removed value: " + removedValue);

        removedValue = queue.deQueue();
        System.out.println("removed value: " + removedValue);

        System.out.println("deleted queue;");
        queue.print();

        queue.enQueue(20);
        System.out.println("your queue;");
        queue.print();

        queue.editQueue();

        queue.enQueue(18);
        queue.enQueue(21);
        queue.enQueue(24);
        System.out.println("your queue;");
        queue.print();
    }
}
