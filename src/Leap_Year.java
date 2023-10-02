import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        // Find a given year is a leap year. 
        // if (year is not divisible by 4) then (it is an ordinary year)
        //else if (year is not divisible by 100) then (it is a leap year)
        //else if (year is not divisible by 400) then (it is an ordinary year)
        //else (it is a leap year)
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
