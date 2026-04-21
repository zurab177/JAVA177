
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите N: ");
        int n = sc.nextInt();

        int i = 1;
        int sum = 0;

        do {
            sum += i;
            i++;
        } while (i <= n);

        System.out.println("Сумма: " + sum);
    }
}
