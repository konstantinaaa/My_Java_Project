import java.util.Scanner;

public class Max_Of_Three_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Please give me 3 numbers:");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if (a > b && a > c) {
            System.out.println("The max number is: " + a);
        }
        else if (b > c) {
            System.out.println("The max number is: " + b);
        }
        else System.out.println("The max number is " + c);


    }
}
