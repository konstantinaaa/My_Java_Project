import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        /* Display fibonacci Series.
        the Fibonacci sequence is a sequence in
        which each number is the sum of the two preceding ones.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Program to print Fibonacci Series.");
        System.out.println("Enter number of terms:");

        int n = scanner.nextInt();

        int a = 0, b = 1, c; // Starting from 0 and 1

        System.out.print(a + "," + b + ",");
        for(int i = 0; i < n-2; i++) // n-2 because I have already printed the first two terms
        {
            c = a+b;
            System.out.print(c + ",");
            a = b;
            b = c;
        }
    }
}
