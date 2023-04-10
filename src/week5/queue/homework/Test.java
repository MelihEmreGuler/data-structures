package week5.queue.homework;

public class Test {
    public static void main(String[] args) {

        boolean flag;
        do {
            String word = Utils.getUserInputString("Kelimeyi Girin...:");

            Stack stack = new Stack(word.length());
            Queue queue = new Queue(word.length());

            Utils.fillStackWithLetters(stack, word);
            Utils.fillQueueWithLetters(queue, word);

            stack.print();
            queue.print();

            boolean isPalindrome = Palindrome.isPalindrome(stack, queue);

            if (isPalindrome) {
                System.out.println("******Palindrom Bir Kelime Girdiniz...");
            } else {
                System.out.println("******Girilen Kelime Palindrom Değil...");
            }

            flag =  Utils.askUserToContinue("******Devam Etmek İstiyor musunuz?<e/h>...");
        }while (flag);
    }
}
