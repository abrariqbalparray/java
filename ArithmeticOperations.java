import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Sum = " + (a + b));
        System.out.println("Multiply = " + (a * b));
        System.out.println("Subtract = " + (a - b));
        System.out.println("Divide = " + (a / b));
        System.out.println("Remainder = " + (a % b));
        sc.close();
    }
}