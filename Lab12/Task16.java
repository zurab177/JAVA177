import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println(reversed);

        sc.close();
    }
}