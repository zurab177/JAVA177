import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String word = sc.nextLine();

        System.out.println(input.startsWith(word));
        sc.close();
    }
}