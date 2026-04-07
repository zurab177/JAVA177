import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String result = input.replaceAll("[aeiouауоыиэяюёеAEIOUАУОЫИЭЯЮЁЕ]", "*");
        System.out.println(result);

        sc.close();
    }
}