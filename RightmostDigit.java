import java.util.Scanner;

public class RightmostDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a % 10 == b % 10 || b % 10 == c % 10 || a % 10 == c % 10)
            System.out.println(true);
        else
            System.out.println(false);
        sc.close();
    }
}