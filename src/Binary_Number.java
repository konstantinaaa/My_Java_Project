public class Binary_Number {
    public static void main(String[] args) {
        // Find if a number is Binary or not.
        // Find is a number is Hexa - Decimal or not.

        int b = 10110001;
        String str = String.valueOf(b);
        System.out.printf("Is %d binary? " + str.matches("[0-1]*"), b);
        System.out.println();

        String str1 = "B2364A";
        System.out.printf("Is %s hexadecimal? " + str1.matches("[0-9A-F]+"), str1);
        System.out.println();


    }
}
