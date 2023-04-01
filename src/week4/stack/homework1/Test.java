package week4.stack.homework1;

import java.util.Scanner;

import static week4.stack.homework1.Utils.validateScannerHasNextInt;

public class Test {
    public static void main(String[] args) {

        String promptMessage = "Please enter the size you want to set your stack:";
        System.out.println(promptMessage);

        Scanner scanner = new Scanner(System.in);
        validateScannerHasNextInt(scanner, promptMessage);
        int size = scanner.nextInt();

        Stack stack = new Stack(size);

        promptMessage = "Please enter the number you want to push in your stack:";
        for (int i = 0; i < size; i++) {
            System.out.println(promptMessage);
            validateScannerHasNextInt(scanner, promptMessage);
            stack.push(scanner.nextInt());
            if (size - 1 - i != 0){
            System.out.println("You will need to enter " + (size - 1 - i) + " more numbers to fill the stack structure");
            }else {
                System.out.println("You have successfully filled the stack structure");
            }
        }

        System.out.println("Your stack:");
        stack.print();

        stack.swapFirstAndLastByLongWay();
        System.out.println("swapped stack:");
        stack.print();

        //stack.swapFirstAndLastByShortWay(); There are one more way to swap in Stack class (if you want to examine)

        stack.popAnyNumber();
        System.out.println("deleted stack:");
        stack.print();

    }
}
