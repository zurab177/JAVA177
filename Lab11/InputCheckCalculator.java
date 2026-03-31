import java.util.*;

public class InputCheckCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            System.out.println("Result: " + (a + b));

        } catch (InputMismatchException e) {
            System.out.println("Error: invalid input!");
        }
    }
}