import java.util.Scanner;

public class Count_Digits_of_a_number {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scanner.nextInt();

        int count = 0;
        while(number > 0)
        {
            number = number / 10;
            count ++;
        }
        System.out.println(count);
    }
}
