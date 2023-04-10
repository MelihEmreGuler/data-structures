package week5.queue.homework;

public class Stack {
    int size;
    int top;
    char[] letters;

    Stack(int size) {
        this.size = size;
        top = -1;
        letters = new char[size];
    }

    void push(char data) {
        if (isFull()) {
            System.out.println("Stack is full. Can not insert!");
        } else {
            //increase the top by 1 and put the letter in letters
            this.letters[++top] = data;
        }
    }

    char pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to remove!");
            return '!';
        } else {
            //return the popped letter and decrease the top by 1
            return letters[top--];
        }
    }

    void print() {
        if (isEmpty()) { // check if the stack is already empty
            System.out.println("The stack is empty. Nothing to print!");
            return;
        }
        System.out.println("---STACK YAPISI---");
        for (int i = top; i > -1; i--) {
            System.out.println(letters[i]);
        }

    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == size - 1;
    }
}
