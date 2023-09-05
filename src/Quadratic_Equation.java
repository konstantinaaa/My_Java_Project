import java.util.Scanner;

public class Quadratic_Equation {
    public static void main(String[] args) {

        int a, b, c;
        double r1,r2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give me 3 coefficients:");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        int D = (int) (Math.pow(b, 2) - 4*a*c);
        r1 = (double)(-b + Math.sqrt(D))/(2*a);
        r2 = (double)(-b -Math.sqrt(D))/(2*a);

        System.out.println("Roots: " + r1 + ", " + r2);

    }

}
