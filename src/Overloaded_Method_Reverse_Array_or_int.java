import java.util.Arrays;

public class Overloaded_Method_Reverse_Array_or_int {
    // Overloaded method to reverse an int or array

    static int reverse(int n)
    {
        int reverse = 0, r; //r = remainder

        while(n>0)
        {
            r = n % 10;
            reverse = reverse*10 + r;
            n = n / 10;
        }
        return reverse;
    }

    static String reverse(int A[])
    {
        int B[] = new int[A.length];

        for(int i = A.length-1, j=0; i>=0; i--, j++)
        {
            B[j] = A[i];
        }
        return Arrays.toString(B);
    }
    public static void main(String[] args) {

        int n =8975;
        System.out.println("The reverse number of " + n + " is: " + reverse(n));

        int A[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("The reverse array is: " + reverse(A));

    }
}
