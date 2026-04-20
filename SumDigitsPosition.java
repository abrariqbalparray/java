import java.util.*;

public class SumDigitsPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int oddSum = 0, evenSum = 0, pos = 1;

        while (num > 0) {
            int digit = num % 10;

            if (pos % 2 == 0)
                evenSum += digit;
            else
                oddSum += digit;

            num /= 10;
            pos++;
        }

        System.out.println("Odd sum = " + oddSum);
        System.out.println("Even sum = " + evenSum);
        System.out.println("Difference = " + (oddSum - evenSum));
        sc.close();
    }
}