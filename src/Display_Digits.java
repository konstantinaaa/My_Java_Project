import java.util.Scanner;

public class Display_Digits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = scanner.nextInt();

        int remainder;
        while(number > 0)
        {
            remainder = number % 10;
            number = number / 10;
            System.out.println(remainder);
        }
    }
}
