import java.util.Scanner;

public class AP_Series {
    public static void main(String[] args) {
        /* Display AP Series.
        An arithmetic progression is a sequence of numbers such
        that the difference from any succeeding term to its preceding
        term remains constant throughout the sequence.
        e.g. 5, 10, 15, 20, ...
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Program to print AP Series.");
        System.out.println("Enter the initial term: a, the common difference: d, and the n-th term of sequence: n");

        int a = scanner.nextInt();
        int d = scanner.nextInt();
        int n = scanner.nextInt();

        int term = a;
        for(int i = 0; i < n; i++)
        {
            System.out.print(term + ",");
            term = term + d;
        }

    }
}
