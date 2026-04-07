import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Первая строка: ");
        String str1 = scanner.nextLine();

        System.out.print("Вторая строка: ");
        String str2 = scanner.nextLine();

        System.out.println("Равны? " + str1.equals(str2));

        scanner.close();
    }
}