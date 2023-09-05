import java.util.Arrays;

public class Sorting_Array_of_Strings {
    public static void main(String[] args) {

        String arr[] = {"java", "python", "pascal", "smalltalk", "ada", "basic"};
        java.util.Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println("==============");

        for(String x:arr) System.out.println(x);
    }
}
