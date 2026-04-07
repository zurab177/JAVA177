import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        System.out.print("Введите слово для поиска: ");
        String word = scanner.nextLine();

        System.out.println("Найдено? " + input.contains(word));

        scanner.close();
    }
}