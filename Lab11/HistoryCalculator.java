import java.util.*;

public class HistoryCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            System.out.print("Enter a: ");
            double a = sc.nextDouble();

            System.out.print("Enter b: ");
            double b = sc.nextDouble();

            double result = a + b;

            String record = a + " + " + b + " = " + result;
            history.add(record);

            System.out.println("Result: " + result);
        }

        System.out.println("\nHistory:");
        for (String h : history) {
            System.out.println(h);
        }
    }
}