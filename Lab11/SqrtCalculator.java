import java.util.Scanner;

public class SqrtCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        double x = sc.nextDouble();

        if (x >= 0) {
            System.out.println("Result: " + Math.sqrt(x));
        } else {
            System.out.println("Error: negative number");
        }
    }
}