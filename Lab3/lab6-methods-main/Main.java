import java.util.Scanner;
import java.util.Locale;

public class Main {

    // Задание 1: площадь прямоугольника
    public static double rectangleArea(double width, double height) {
        return width * height;
    }

    // Задание 2: чётность
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Задание 3: перегрузка max (int)
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Задание 3: перегрузка max (double)
    public static double max(double a, double b) {
        return (a > b) ? a : b;
    }

    // Задание 4: рекурсивный факториал
    public static long factorial(int n) {
        if (n < 0) {
            System.out.println("Факториал отрицательного числа не определён.");
            return -1;
        }
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    // Задание 5: рекурсивная степень
    public static long power(int base, int exponent) {
        if (exponent < 0) {
            System.out.println("Отрицательная степень не поддерживается.");
            return -1;
        }
        if (exponent == 0) return 1;
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);   // 🔥 ВАЖНО! Для ввода 2.5 вместо 2,5

        // ===== Задание 1 =====
        System.out.println("=== Задание 1: Площадь прямоугольника ===");
        System.out.print("Введите ширину: ");
        double width = scanner.nextDouble();
        System.out.print("Введите высоту: ");
        double height = scanner.nextDouble();
        double area = rectangleArea(width, height);
        System.out.println("Площадь прямоугольника: " + area);

        // ===== Задание 2 =====
        System.out.println("\n=== Задание 2: Чётность числа ===");
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        System.out.println(isEven(number) ? 
            "Число " + number + " чётное." : 
            "Число " + number + " нечётное.");

        // ===== Задание 3 =====
        System.out.println("\n=== Задание 3: Перегрузка max ===");

        System.out.print("Введите два int числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("max(int): " + max(a, b));

        System.out.print("Введите первое double число: ");
        double da = scanner.nextDouble();
        System.out.print("Введите второе double число: ");
        double db = scanner.nextDouble();
        System.out.println("max(double): " + max(da, db));

        // ===== Задание 4 =====
        System.out.println("\n=== Задание 4: Факториал (рекурсия) ===");
        System.out.print("Введите n: ");
        int n = scanner.nextInt();
        long fact = factorial(n);
        if (fact != -1) {
            System.out.println("Факториал " + n + " = " + fact);
        }

        // ===== Задание 5 =====
        System.out.println("\n=== Задание 5: Степень (рекурсия) ===");
        System.out.print("Введите base: ");
        int base = scanner.nextInt();
        System.out.print("Введите exponent (>= 0): ");
        int exponent = scanner.nextInt();
        long pow = power(base, exponent);
        if (pow != -1) {
            System.out.println(base + "^" + exponent + " = " + pow);
        }

        scanner.close();
    }
}