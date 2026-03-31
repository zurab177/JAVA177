import java.util.Scanner;

public class CalculatorLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String again = "yes";

        while (again.equalsIgnoreCase("yes")) {

            System.out.print("Введите первое число: ");
            double a = scanner.nextDouble();

            System.out.print("Введите второе число: ");
            double b = scanner.nextDouble();

            System.out.print("Операция (+ - * /): ");
            char op = scanner.next().charAt(0);

            switch (op) {
                case '+': System.out.println(a + b); break;
                case '-': System.out.println(a - b); break;
                case '*': System.out.println(a * b); break;
                case '/':
                    if (b != 0) System.out.println(a / b);
                    else System.out.println("Ошибка!");
                    break;
            }

            System.out.print("Продолжить? (yes/no): ");
            again = scanner.next();
        }
    }
}