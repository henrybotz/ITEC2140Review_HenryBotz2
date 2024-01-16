import java.util.Scanner;
public class LoopPractice2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int sum = 0;
            int number;

            System.out.println("Enter a number (enter a negative number to stop):");

            while ((number = scanner.nextInt()) >= 0) {
                sum += number;
                System.out.println("Enter another number (or a negative number to stop):");
            }

            System.out.println("Sum of positive numbers entered: " + sum);

            scanner.close();
        }
}

