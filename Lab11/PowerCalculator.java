import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        double x = sc.nextDouble();

        System.out.print("Enter power: ");
        double y = sc.nextDouble();

        double result = Math.pow(x, y);

        System.out.println("Result: " + result);
    }
}