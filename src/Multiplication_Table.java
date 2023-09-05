import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {
        // Display Multiplication Table
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int n = scanner.nextInt();

        for (int i =1; i <= 10; i++)
        {
            System.out.println(n + "*" + i +"=" + n*i );
        }
    }
}
