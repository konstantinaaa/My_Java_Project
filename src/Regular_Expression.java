public class Regular_Expression {
    public static void main(String[] args) {

        // Remove special characters from a String.
        String str = "a!B@c#1$2%3";
        System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));

        // Remove extra spaces from a String.
        String str1 = "    abc   de   fgh   ijk   ";
        System.out.println(str1.replaceAll("\\s+", " ").trim());

        // Find number of words in a String.
        String str2 = "abc  de   fgh    ijk";
        str2 = str2.replaceAll("\\s+", " ").trim();
        String words[] = str2.split("\\s");
        System.out.println(words.length);

        
    }
}