package week5.queue.homework;

public class Palindrome {

    private Palindrome(){}
    static boolean isPalindrome(Stack stack, Queue queue){
        if (stack.isEmpty()) { // check if the stack is already empty
            System.out.println("The stack is empty.");
            return false;
        }
        if (queue.isEmpty()) { // check if the queue is already empty
            System.out.println("The queue is empty.");
            return false;
        }
        if (stack.size != queue.size){
            System.out.println("structure sizes are not equal.");
            return false;
        }

        // Check if the elements in the stack and queue form a palindrome
        while (!stack.isEmpty() && !queue.isEmpty()){
            char c1 = stack.pop();
            char c2 = queue.deQueue();

            // If the characters are not equal, return false
            if (c1 != c2){
                return false;
            }
        }
/*
        //same as above while loop
        for (int i = 0; i < stack.size; i++){
            if (stack.pop() != queue.deQueue()){
                return false;
            }
        }
*/
        // If we reach here, it means that the elements in the stack and queue form a palindrome
        return true;
    }
}
