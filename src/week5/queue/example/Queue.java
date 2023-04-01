package week5.queue.example;

public class Queue {
    int front; // index of the front element
    int rear; // index of the rear element
    int[] values; // array to hold the elements
    int size; // maximum number of elements that can be stored in the queue

    Queue(int size) {
        this.size = size;
        values = new int[size];
        rear = front = -1; // initialize front and rear to -1 (empty queue)
    }

    // add an element to the rear of the queue
    void enQueue(int data) {
        if (isFull()) { // check if the queue is already full
            System.out.println("The queue is already full. Failed to add " + data);
            return;
        }
        values[++rear] = data; // increment rear and add the new element
    }

    // remove the element from the front of the queue and return its value
    int deQueue() {
        if (isEmpty()) { // check if the queue is already empty
            System.out.println("The queue is already empty. Nothing to remove!");
            return -1; // return -1 to indicate an error
        }

        front++; // increment front to remove the first element
        int deletedData = values[front]; // get the value of the deleted element
        return deletedData;
    }

    // remove all the elements before the front index
    void editQueue() {
        for (int i = 0; i < size - front -1; i++) {
            values[i] = values[i + front + 1]; // shift the elements to the left
            values[i + front +1] = 0; // set the last element to 0
        }
        rear -= front + 1; // update the rear index
        front = -1; // reset the front index
    }

    // check if the queue is empty
    boolean isEmpty() {
        return rear == front; // if rear and front are equal, the queue is empty
    }

    // check if the queue is full
    boolean isFull() {
        return rear == size - 1; // if rear is equal to size - 1, the queue is full
    }

    // print all the elements in the queue
    void print() {
        if (isEmpty()) { // check if the queue is already empty
            System.out.println("The queue is empty. Nothing to print!");
            return;
        }

        for (int i = front + 1; i <= rear; i++) { // iterate through the queue from front to rear
            System.out.println(values[i]); // print each element
        }
    }
}