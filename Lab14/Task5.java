
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int original = num;
        int reversed = 0;

        do {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        } while (num > 0);

        if (original == reversed) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }
    }
}
