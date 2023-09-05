import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {

        int length, width, height;
        int totalArea, volume;

        Scanner scanner = new Scanner(System.in);

        System.out.print("length: ");
        length = scanner.nextInt();

        System.out.print("width: ");
        width = scanner.nextInt();

        System.out.print("height: ");
        height = scanner.nextInt();

        totalArea = 2*(length*width + length*height + height*width);
        volume = height*length*width;

        System.out.println();
        System.out.println("Total Area: " + totalArea);
        System.out.println("Volume: " + volume);

    }
}
