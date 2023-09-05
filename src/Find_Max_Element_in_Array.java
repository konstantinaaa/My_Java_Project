public class Find_Max_Element_in_Array {
    public static void main(String[] args) {

        int A[] = {12, 5, 6, 78, 8, 9, 3};

        int max = A[0];
        for(int i = 0; i < A.length; i++)
        {
            if(A[i] > max)
                max = A[i];
        }
        System.out.println("The max element is: " + max);
    }
}
