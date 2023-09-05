import java.util.Scanner;

public class Calculate_Triangle_Area {
    public static void main(String[] args) {

        float height, base, area;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give me the height:");
        height = scanner.nextFloat();

        System.out.println("Please give me the base:");
        base = scanner.nextFloat();

        area = (height*base)/2f;

        System.out.println("The area of Triangle is: " + area);

    }
}
