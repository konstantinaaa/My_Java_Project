import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Serching_an_Element {
    public static void main(String[] args) {
        // We suppose there aren't duplicates.
        int A[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a key:");
        int key = scanner.nextInt();

        for(int i = 0; i < A.length; i++)
        {
            if(A[i] == key)
            {System.out.println("Element found at: " + i);
            System.exit(0);
            }

        }
        System.out.println("Not found.");
    }

}
