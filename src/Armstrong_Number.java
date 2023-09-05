import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        /* Find if a number is Armstrong or not
        Armstrong number is a number that is equal to the
        sum of cubes of its digits. e.g. number 153 : 1^3+5^3+3^3 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = scanner.nextInt();
        int num = number;

        int remainder, sum = 0;
        while(number > 0)
        {
            remainder = number % 10;
            sum += remainder*remainder*remainder; // I do not use power method because I want integer result.
            number = number / 10;
        }
        if(sum == num) System.out.println("It's an Armstrong number." );
        else System.out.println("Isn't an Armstrong number." );

    }
}
