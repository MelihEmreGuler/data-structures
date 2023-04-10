package week5.queue.homework;

public class Queue {
    int front; // index of the front element
    int rear; // index of the rear element
    char[] letters; // array to hold the elements
    int size; // maximum number of elements that can be stored in the queue

    Queue(int size){
        this.size = size;
        letters = new char[size];
        rear = front = -1; // initialize front and rear to -1 (empty queue)
    }

    void enQueue(char letter) {
        if (isFull()) { // check if the queue is already full
            System.out.println("The queue is already full. Failed to add " + letter);
            return;
        }
        letters[++rear] = letter; // increment rear and add the new letter
    }

    char deQueue() {
        if (isEmpty()) { // check if the queue is already empty
            System.out.println("The queue is already empty. Nothing to remove!");
            return '!'; // return -1 to indicate an error
        }

        front++; // increment front to remove the first element
        // get the value of the deleted element
        char letter = letters[front];
        return letter;
    }

    void print() {
        if (isEmpty()) { // check if the queue is already empty
            System.out.println("The queue is empty. Nothing to print!");
            return;
        }

        System.out.println("---QUEUE YAPISI---");
        for (int i = front + 1; i <= rear; i++) { // iterate through the queue from front to rear
            System.out.println(letters[i]); // print each element
        }
    }

    boolean isEmpty() {
        return rear == front; // if rear and front are equal, the queue is empty
    }

    // check if the queue is full
    boolean isFull() {
        return rear == size - 1; // if rear is equal to size - 1, the queue is full
    }

}