import java.util.Scanner;

public class Menu_Driven_Program {
    public static void main(String[] args) {
        // Make a Menu Driven Program for Arithmetic Operations
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("======");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");

        System.out.println("Please enter 2 numbers:");
        float x = scanner.nextFloat();
        float y = scanner.nextFloat();
        scanner.nextLine(); // I put this here else is not reading the 20 line
        System.out.println("Enter one of above menu options:");
        String option = scanner.nextLine();
        option = option.toUpperCase();

        switch (option)
        {
            case "ADD": System.out.println("Sum is: " + (x + y));
                break;
            case "SUB": System.out.println("Difference is: " + (x - y));
                break;
            case "MUL": System.out.println("Product is: " + (x * y));
                break;
            case "DIV": System.out.println("Ration is: " + (x / y));
                break;
            default: System.out.println("Invalid Option.");


        }

    }
}
