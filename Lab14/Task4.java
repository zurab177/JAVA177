
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int max = 0;

        do {
            int digit = num % 10;

            if (digit > max) {
                max = digit;
            }

            num /= 10;

        } while (num > 0);

        System.out.println("Максимальная цифра: " + max);
    }
}
