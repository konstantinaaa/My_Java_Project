import java.util.Scanner;

public class Website_Switch {
    public static void main(String[] args) {
        // Display type of website
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter domain name of a website:");
        String domain = scanner.nextLine();

        String ext = domain.substring(domain.lastIndexOf(".")+1);

        switch(ext)
        {
            case "com": System.out.println("Commercial");
                break;
            case "org": System.out.println("Organization");
                break;
            case "net": System.out.println("Network");
                break;
            case "gov": System.out.println("Government");
                break;
        }

    }
}
