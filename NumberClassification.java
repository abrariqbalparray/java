import java.util.*;

public class NumberClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num > 0)
            System.out.println("Positive");
        else if (num < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");

        System.out.println((num % 2 == 0) ? "Even" : "Odd");

        System.out.println((num % 5 == 0) ? "Multiple of 5" : "Not multiple of 5");

        System.out.println((num >= 100 && num <= 999) ? "Three digit" : "Not three digit");
        sc.close();
    }
}