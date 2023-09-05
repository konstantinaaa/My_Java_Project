import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // Factorial of a number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = scanner.nextInt();

        long fact = 1;

        for(int i = 1; i <= number; i++)
        {
            fact *= i;
        }
        System.out.println("The factorial of " + number + " is: " + fact);
    }
}
