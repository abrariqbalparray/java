import java.util.*;

public class SpecialNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int d1 = num / 10;
        int d2 = num % 10;

        int result = (d1 + d2) + (d1 * d2);

        if (result == num)
            System.out.println("Special number");
        else
            System.out.println("Not special");
        sc.close();
    }
}