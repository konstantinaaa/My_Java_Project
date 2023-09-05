import java.util.Scanner;

public class GP_Series {
    public static void main(String[] args) {
        /* Display GP Series.
        A geometric progression (GP) is a progression the
        ratio of any term and its previous term is equal to
        a fixed constant.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Program to print GP Series.");
        System.out.println("Enter the initial term: a, the common ratio: r, and the n-th term of sequence: n");

        int a = scanner.nextInt();
        int r = scanner.nextInt();
        int n = scanner.nextInt();

        int term = a;
        for(int i = 0; i < n; i++)
        {
            System.out.print(term + ",");
            term = term*r;
        }
    }
}
