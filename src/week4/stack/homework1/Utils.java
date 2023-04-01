package week4.stack.homework1;

import java.util.Scanner;

public class Utils {

    private Utils(){
    }

    static int getUserInputInteger(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt + " ");
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. " + prompt + " ");
            scanner.next();
        }
        int num = scanner.nextInt();
        return num;
    }

    public static void validateScannerHasNextInt(Scanner scanner, String prompt) {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. \n" + prompt + " ");
            scanner.next();
        }
    }
}
