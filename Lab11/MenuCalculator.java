import java.util.Scanner;

public class MenuCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");

        System.out.print("Choose: ");
        int choice = sc.nextInt();

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        switch (choice) {
            case 1: System.out.println(a + b); break;
            case 2: System.out.println(a - b); break;
            case 3: System.out.println(a * b); break;
            case 4:
                if (b != 0) System.out.println(a / b);
                else System.out.println("Error");
                break;
            default:
                System.out.println("Wrong choice");
        }
    }
}