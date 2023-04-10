package week5.queue.homework;

import java.util.Scanner;

public class Utils {
    private Utils(){
    }

    static String getUserInputString(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        //return user input string
        return scanner.nextLine();
    }

    static boolean askUserToContinue(String prompt){
        char answer = getUserInputChar(prompt);

        //check is the input 'e' or 'h'
        while ((answer != 'e') && (answer != 'h')){
            System.out.print("Invalid input. ");
            answer = getUserInputChar(prompt);
        }

        //'e' -> true, 'h' -> false
        return answer == 'e';
    }

    static char getUserInputChar(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt + " ");

        // keep prompting user until they enter a valid input (a single character)
        while (!scanner.hasNextLine() && scanner.nextLine().length() != 1) {
            System.out.print("Invalid input. " + prompt + " ");
            scanner.next();
        }
        //return user input character
        return scanner.nextLine().charAt(0);
    }

    static void fillStackWithLetters(Stack stack, String word){
        //transfer the letters of the word to the array.
        char[] letters = word.toCharArray();
        //push all the letters in the stack.
        for (char letter : letters) {
            stack.push(letter);
        }
    }
    static void fillQueueWithLetters(Queue queue, String word){
        //transfer the letters of the word to the array.
        char[] letters = word.toCharArray();
        //push all the letters in the queue.
        for (char letter : letters) {
            queue.enQueue(letter);
        }
    }
}
