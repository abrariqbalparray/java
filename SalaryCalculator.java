import java.util.*;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double basic = sc.nextDouble();

        double hra = (basic <= 20000) ? 0.2 * basic : 0.3 * basic;
        double da = 0.8 * basic;

        double gross = basic + hra + da;
        double tax = (gross > 50000) ? 0.1 * gross : 0;

        double net = gross - tax;

        System.out.println("Gross = " + gross);
        System.out.println("Net = " + net);
        sc.close();
    }
}