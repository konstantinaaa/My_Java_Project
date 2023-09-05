import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        // Find grades for given marks.
        Scanner scanner = new Scanner(System.in);
        int m1, m2, m3;


        System.out.println("Please enter marks of 3 subjects:");
        m1 = scanner.nextInt();
        m2 = scanner.nextInt();
        m3 = scanner.nextInt();

        float avg = (float)(m1 + m2 +m3)/3;


        if (avg >= 70)
        {
            System.out.println("Grade A.");
        }
        else if (avg >= 60 && avg < 70)
        {
            System.out.println("Grade B.");
        }
        else if (avg >= 50 && avg < 60)
        {
            System.out.println("Grade C.");
        }
        else if (avg >= 40 && avg < 50)
        {
            System.out.println("Grade D.");
        }
        else System.out.println("Grade E.");

    }
}
