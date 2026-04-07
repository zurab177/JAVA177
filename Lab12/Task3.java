import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.trim().split("\\s+");
        System.out.println("Количество слов: " + words.length);

        scanner.close();
    }
}