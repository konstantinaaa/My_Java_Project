import java.util.Scanner;

public class Overloaded_Method_Validate_Name_Age {

    static boolean validate(String name)
    {
        return name.matches("[a-zA-Z\\s]+");
    }

    static boolean validate(int age)
    {
        return age >= 3 && age <= 15;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give a name: ");
        String name = scanner.nextLine();

        System.out.println("Please give me the age:");
        int age = scanner.nextInt();

        System.out.println("Is the name validate? " + validate(name));
        System.out.println("Is " + name + " a student? " + validate(age));


    }
}