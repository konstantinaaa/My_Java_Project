import java.util.Arrays;

public class Rotating_an_Array {
    public static void main(String[] args) {
        int A[] = {5, 9, 6, 10, 12, 7, 3, 5, 4, 2};
        System.out.print(Arrays.toString(A));
        System.out.println();

        int temp = A[0];
        for(int i = 1; i < A.length; i++)
        {
            A[i-1] = A[i];
        }
        A[A.length - 1] = temp; // into the last position I put temp
        System.out.println(Arrays.toString(A));

    }
}
