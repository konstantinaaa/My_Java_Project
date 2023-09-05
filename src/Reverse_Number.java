import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        // Reverse a number

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = scanner.nextInt();

        int reverse = 0, r; // r = remainder
        while (number > 0)
        {
            r = number % 10;
            reverse = reverse * 10 + r;
            number = number / 10;
        }
        System.out.println("Reverse number: " + reverse);

    }
}
