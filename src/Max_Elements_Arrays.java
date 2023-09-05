public class Max_Elements_Arrays {
    public static void main(String[] args) {
        // Finding Maximum Element
        int A[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
        int max = A[0];

        for(int i = 0; i < A.length; i++)
        {
            if(A[i] > max) {
                max = A[i];
            }

        }
        System.out.println("The max element is: " + max);
    }
}
