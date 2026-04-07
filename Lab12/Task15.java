import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String symbol = sc.nextLine();

        System.out.println(input.endsWith(symbol));
        sc.close();
    }
}