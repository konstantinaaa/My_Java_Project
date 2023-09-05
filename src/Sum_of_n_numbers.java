import java.util.Scanner;

public class Sum_of_n_numbers {
    public static void main(String[] args) {
        // Fina Sum of n numbers
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= number; i++)
        {
            sum += i;
        }
        System.out.println("Sum of " + number + " number is: " + sum);

    }
}
