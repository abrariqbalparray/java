import java.util.Scanner;

public class AreaPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        System.out.print("Enter length and width: ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();

        double circleArea = Math.PI * radius * radius;
        double circlePerimeter = 2 * Math.PI * radius;

        double rectArea = length * width;
        double rectPerimeter = 2 * (length + width);

        System.out.println("Circle Area = " + circleArea);
        System.out.println("Circle Perimeter = " + circlePerimeter);
        System.out.println("Rectangle Area = " + rectArea);
        System.out.println("Rectangle Perimeter = " + rectPerimeter);
        sc.close();
    }
}