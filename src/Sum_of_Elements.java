public class Sum_of_Elements {
    public static void main(String[] args) {
        // Finding Sum of all elements
        int A[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};

        int sum = 0;
        for(int i: A)
        {
            sum += i;
        }
        System.out.println("The sum is: " + sum);
    }
}
