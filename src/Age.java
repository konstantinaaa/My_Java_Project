import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        // Find person is your or not young.
        int age;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age:");
        age = scanner.nextInt();

        if (age >= 14 && age <= 55)
        {
            System.out.println("You are young.");
        }
        else
        {
            System.out.println("You are not young.");
        }

    }
}
