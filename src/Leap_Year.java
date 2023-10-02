import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        // Find a given year is a leap year. Extra leap day occurs in each year that is an integer multiple of 4 
        // (except for years evenly divisible by 100, but not by 400).
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year number:");
        int year =  scanner.nextInt();

        if (year % 4 == 0)
        {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Leap year.");
                }
                else System.out.println("Not Leap year");
            }
            else  System.out.println("Leap year.");
        }
        else System.out.println("Not a leap year.");
    }
}
