import java.util.Scanner;

public class Find_Prime_numbers {
    /*A prime number is a number that can
    only be divided by itself and 1 without remainders. */

    static boolean isPrime(int n)
    {
        for(int i = 2; i < n/2; i++)
        {
            if(n%i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int n = scanner.nextInt();

        if(isPrime(n))
            System.out.println(n + " is prime.");
        else
            System.out.println(n + " is not prime.");

    }
}
