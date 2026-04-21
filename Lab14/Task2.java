
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = sc.nextInt();

        int count = 0;

        do {
            num /= 10;
            count++;
        } while (num != 0);

        System.out.println("Количество цифр: " + count);
    }
}
