package week4.stack.example;

public class Test {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.pop();
        stack.pop();

        stack.print();
        System.out.println("---------");

        stack.reset();
        stack.print();
        System.out.println("---------");

        stack.push(8);
        stack.push(4);
        stack.push(2);
        stack.push(0);
        stack.insertAndRemoveSmallerElements(3);
        stack.print();
    }
}
