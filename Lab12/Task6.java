import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        System.out.print("Что заменить: ");
        String oldWord = scanner.nextLine();

        System.out.print("На что заменить: ");
        String newWord = scanner.nextLine();

        System.out.println("Результат: " + input.replace(oldWord, newWord));

        scanner.close();
    }
}