
import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count = 0;

        do {
            int digit = num % 10;

            if (digit % 2 == 0) {
                count++;
            }

            num /= 10;

        } while (num > 0);

        System.out.println("Чётных цифр: " + count);
    }
}
