import java.util.*;

public class AlternateSeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += (i % 2 == 0) ? -i : i;
        }

        System.out.println("Sum = " + sum);
        sc.close();
    }
}