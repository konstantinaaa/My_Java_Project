public class Sum_using_vargars {

    static int sum(int ...A)
    {
        int sum = 0;
        for(int i = 0; i < A.length; i++)
            sum += A[i];
        return sum;
    }
    public static void main(String[] args) {

        System.out.println(sum(1, 2, 3, 4, 5, 6));
        // if I want double I will make another method

    }
}
