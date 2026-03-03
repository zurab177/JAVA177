import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Лабораторная работа №5: Циклы Java ===");
            System.out.println("1) Вывод чисел от 1 до N (for)");
            System.out.println("2) Сумма от 1 до N (while)");
            System.out.println("3) Факториал N (for)");
            System.out.println("4) Четные числа 1..100 (while + continue)");
            System.out.println("5) Ввод чисел до 0, сумма (do-while)");
            System.out.println("6) Таблица умножения 1..5 (вложенные циклы)");
            System.out.println("0) Выход");
            System.out.print("Выберите задание: ");

            int choice = readInt(sc);

            switch (choice) {
                case 1 -> task1(sc);
                case 2 -> task2(sc);
                case 3 -> task3(sc);
                case 4 -> task4();
                case 5 -> task5(sc);
                case 6 -> task6();
                case 0 -> {
                    System.out.println("Выход из программы.");
                    sc.close();
                    return;
                }
                default -> System.out.println("Неверный пункт меню. Повторите.");
            }
        }
    }

    private static int readInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("Ошибка ввода. Введите целое число: ");
            sc.next();
        }
        return sc.nextInt();
    }

    // Задание 1
    private static void task1(Scanner sc) {
        System.out.print("Введите N: ");
        int n = readInt(sc);

        if (n < 1) {
            System.out.println("N должно быть >= 1");
            return;
        }

        System.out.println("Числа от 1 до " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Задание 2
    private static void task2(Scanner sc) {
        System.out.print("Введите N: ");
        int n = readInt(sc);

        if (n < 1) {
            System.out.println("N должно быть >= 1");
            return;
        }

        int i = 1;
        long sum = 0;

        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("Сумма чисел от 1 до " + n + " равна: " + sum);
    }

    // Задание 3
    private static void task3(Scanner sc) {
        System.out.print("Введите N: ");
        int n = readInt(sc);

        if (n < 0) {
            System.out.println("Факториал определён для N >= 0");
            return;
        }

        long fact = 1;

        for (int i = 2; i <= n; i++) {
            fact *= i;
        }

        System.out.println(n + "! = " + fact);
    }

    // Задание 4
    private static void task4() {
        System.out.println("Чётные числа от 1 до 100:");

        int i = 1;
        while (i <= 100) {
            i++;
            if (i % 2 != 0) {
                continue;
            }
            if (i <= 100) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Задание 5
    private static void task5(Scanner sc) {
        long sum = 0;
        int x;

        System.out.println("Вводите числа. Для завершения введите 0.");

        do {
            System.out.print("Введите число: ");
            x = readInt(sc);
            sum += x;
        } while (x != 0);

        System.out.println("Сумма введённых чисел равна: " + sum);
    }

    // Дополнительное задание
    private static void task6() {
        System.out.println("Таблица умножения от 1 до 5:");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.printf("%d x %d = %2d   ", i, j, i * j);
            }
            System.out.println();
        }
    }
}