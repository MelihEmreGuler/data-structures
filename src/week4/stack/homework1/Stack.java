package week4.stack.homework1;

public class Stack {
    int size;
    int top;
    int[] data;

    Stack(int size) {
        this.size = size;
        top = -1;
        data = new int[size];
    }

    void popAnyNumber() {

        if (isEmpty()) {
            System.out.println("The stack is empty. Nothing to pop.");
            return;
        }

        int number = Utils.getUserInputInteger("Please enter the number you want to pop:");

        // check if the number to delete is the top element of the stack
        if (data[top] == number) {
            pop();
            return;
        }

        // find the index of the number to delete
        int indexToDelete = -1;
        for (int i = top; i > -1; i--) {
            if (data[i] == number) {
                indexToDelete = i;
                break;
            }
        }
        // check if the number to delete exists in the stack
        if (indexToDelete == -1) {
            System.out.println("The number you are looking for to delete is not in the stack!");
            return;
        }
        // shift the elements after the deleted element to the left by one index
        for (int i = indexToDelete; i < top; i++) {
            data[i] = data[i+1];
        }
        //pop the extra element because numbers in the stack decreased by 1
        data[top] = 0;
        top--;
    }

    void swapFirstAndLastByShortWay() { //it is a very easy way
        if (isEmpty()) {
            System.out.println("The stack is empty. Nothing to swap.");
            return;
        }

        int up = data[top];
        int down = data[0];

        data[0] = up;
        data[top] = down;
    }

    void swapFirstAndLastByLongWay() {
        // Check if the stack is empty
        if (isEmpty()) {
            System.out.println("The stack is empty. Nothing to swap.");
            return;
        }

        // Save the top element and the bottom element of the stack
        int up = data[top];
        int down = data[0];

        // Create a temporary stack and copy the elements from the original stack in reverse order
        Stack tempStack = new Stack(size);
        for (int i = top; i >= 0; i--) {
            tempStack.push(data[i]);
        }

        // Reset the original stack and push the saved top and bottom elements in swapped positions
        reset();
        push(up);

        //don't push the up and down in the temp stack
        for (int i = data.length - 2; i > 0; i--) {
            push(tempStack.data[i]);
        }
        push(down);
    }

    void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full. Can not insert!");
        } else {
            top++;
            this.data[top] = data;
        }
    }


    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return data[top--];
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            for (int i = top; i > -1; i--) {
                System.out.println(data[i]);
            }
        }
    }

    void reset() {
        top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == size - 1;
    }
}
