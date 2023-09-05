import java.util.Scanner;

public class Palindrome_Number {
    public static void main(String[] args) {
        /* Check if a number is palindrome or not.
           A palindrome number is a number that remains the
           same when digits are reversed. */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = scanner.nextInt();
        int num = number;

        int reverse = 0, r; // r = remainder
        while(number > 0)
        {
            r = number % 10;
            reverse = reverse*10 +r;
            number = number / 10;
        }
        if(num == reverse) System.out.println("It is palindrome number.");
        else System.out.println("Isn't palindrome number.");
    }
}
