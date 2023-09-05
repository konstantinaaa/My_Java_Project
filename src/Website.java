import java.awt.*;
import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        // Find type of website and the protocol used
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a url:");
        String url = scanner.nextLine();

        String protocol = url.substring(0, url.indexOf(":"));

        if (protocol.equals("https"))
            System.out.println("Hypertext Transfer Protocol");
        else if (protocol.equals("ftp"))
            System.out.println("File Transfer Protocol");

        String ext = url.substring(url.lastIndexOf(".")+1);

        if (ext.equals("com"))
            System.out.println("Commercial");
        else if (ext.equals("org"))
            System.out.println("Organization");
        else if (ext.equals("net"))
            System.out.println("Network");
    }
}
