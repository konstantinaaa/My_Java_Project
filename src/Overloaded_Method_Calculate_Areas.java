public class Overloaded_Method_Calculate_Areas {

    static double area(double length, double breadth)
    {
        return length*breadth;
    }

    static double area(double radius)
    {
        return Math.PI*radius*radius;
    }

    public static void main(String[] args) {

        double length = 3, breadth = 7;
        double radius = 5;

        System.out.println("The area of the rectangle is: " + area(length, breadth));
        System.out.println("The area of the circle is: " + area(radius));
    }
}
