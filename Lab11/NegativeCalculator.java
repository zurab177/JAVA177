import java.util.Scanner;

public class NegativeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.println("Sum: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Multiply: " + (a * b));

        if (b != 0)
            System.out.println("Divide: " + (a / b));
        else
            System.out.println("Division error");
    }
}