
import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int min = Integer.MAX_VALUE;

        do {
            System.out.print("Введите число (0 для выхода): ");
            num = sc.nextInt();

            if (num != 0 && num < min) {
                min = num;
            }

        } while (num != 0);

        System.out.println("Минимум: " + min);
    }
}
