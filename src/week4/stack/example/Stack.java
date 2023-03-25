package week4.stack.example;

public class Stack {
    int size;
    int top;
    int[] data;

    Stack(int size) {
        this.size = size;
        top = -1;
        data = new int[size];
    }

    void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full. Can not insert!");
        } else {
            top++;
            this.data[top] = data;
        }
    }

    // Function to insert an element into the stack while removing all smaller elements
    void insertAndRemoveSmallerElements(int data) {
        // Check if the stack is full and if the top element is greater than the incoming data
        if (isFull() && this.data[top] > data) {
            System.out.println("Stack is full. Can not insert!");
        } else {
            // While the stack is not empty and the incoming data is greater than the top element of the stack,
            // remove the top element from the stack
            while (!isEmpty() && data > this.data[top]) {
                pop();
            }

            // Push the incoming data into the stack
            push(data);
        }
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty.");
            return -1;
        }else {
            return data[top--];
        }
    }

    void reset(){
        top = -1;
    }

    void print(){
        if(isEmpty()){
            System.out.println("Stack is empty.");
        }else {
            for(int i = top; i > -1; i--){
                System.out.println(data[i]);
            }
        }
    }

    boolean isFull() {
        return top == size - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }
}
