import java.util.*;

public class DigitFrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();

        int[] count = new int[10];

        for (char c : num.toCharArray()) {
            count[c - '0']++;
        }

        for (int i = 0; i < 10; i++) {
            if (count[i] > 0)
                System.out.println(i + " -> " + count[i]);
            sc.close();
        }
    }
}