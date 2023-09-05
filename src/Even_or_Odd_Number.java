import java.util.Scanner;

public class Even_or_Odd_Number {
    public static void main(String[] args) {
        // Find a number is odd or even.
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give me a number:");
        number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is even.");
        }
        else {
            System.out.println("The number is odd.");
        }

    }

}
