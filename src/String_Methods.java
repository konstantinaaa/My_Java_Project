public class String_Methods {
    public static void main(String[] args) {
        // Find if the email id is on gmail.
        // Find username and domain name for email.

        String str = "programmer@gmail.com";
        int i = str.indexOf("@");
        String Username = str.substring(0,i);
        String Domain = str.substring(i+1);

        System.out.println("Username: " + Username);
        System.out.println("Domain: " + Domain);
        System.out.println("Is this gmail id: " + Domain.matches(".*gmail.*"));
    }
}
