import java.util.Scanner;

public class Number_in_Words {
    public static void main(String[] args) {
        // Display a number in words even with tailing 0

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = scanner.nextInt();

        int r; // r = remainder
        String str = ""; // I use string because if I reverse the number I
        // will have problems with tailing zeros

        while (number > 0)
        {
            r = number % 10;
            number = number / 10;
            str = str + r;
        }
        // System.out.println(str);

        char c;
        for(int i = str.length() - 1; i >= 0; i--)
        {
            c = str.charAt(i);
            switch (c)
            {
                case '0': System.out.print("Zero ");
                    break;
                case '1': System.out.print("One ");
                    break;
                case '2': System.out.print("Two ");
                    break;
                case '3': System.out.print("Three ");
                    break;
                case '4': System.out.print("Four ");
                    break;
                case '5': System.out.print("Five ");
                    break;
                case '6': System.out.print("Six ");
                    break;
                case '7': System.out.print("Seven ");
                    break;
                case '8': System.out.print("Eight ");
                    break;
                case '9': System.out.print("Nine ");
                    break;
            }
        }
    }
}
