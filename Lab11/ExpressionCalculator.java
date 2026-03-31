import java.util.Scanner;

public class ExpressionCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter expression (e.g. 2 + 3 * 4): ");

        double a = sc.nextDouble();
        char op1 = sc.next().charAt(0);
        double b = sc.nextDouble();
        char op2 = sc.next().charAt(0);
        double c = sc.nextDouble();

        double result;

        // приоритет умножения и деления
        if (op2 == '*' || op2 == '/') {

            double temp;

            if (op2 == '*') temp = b * c;
            else temp = b / c;

            if (op1 == '+') result = a + temp;
            else result = a - temp;

        } else {

            double temp;

            if (op1 == '+') temp = a + b;
            else temp = a - b;

            if (op2 == '+') result = temp + c;
            else result = temp - c;
        }

        System.out.println("Result: " + result);
    }
}
