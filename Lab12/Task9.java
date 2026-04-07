import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        System.out.print("Введите разделитель: ");
        String delimiter = scanner.nextLine();

        String[] parts = input.split(delimiter);

        for (String part : parts) {
            System.out.println(part);
        }

        scanner.close();
    }
}