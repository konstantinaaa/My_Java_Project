import java.util.Scanner;

public class GCD_of_2_Numbers {
    /* The greatest common divisor (GCD) of two or more numbers is the
    greatest common factor number that divides them, exactly.
     It is also called the highest common factor.
     */

    static int GCD(int a, int b)
    {

        int gcd = 1;
        int min_number = a;
        if(b<a)
            min_number = b;

         for(int i = 2; i <= min_number; i++)
         {
             if(a % i == 0 && b % i == 0)
                 gcd = i;
         }
         return gcd;
     }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 2 numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();


        System.out.println("The GCD is: " + GCD(a,b));
    }

}
