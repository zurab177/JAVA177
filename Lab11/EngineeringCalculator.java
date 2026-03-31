import java.util.Scanner;

public class EngineeringCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1 - sin");
        System.out.println("2 - cos");
        System.out.println("3 - tan");

        System.out.print("Choose: ");
        int choice = sc.nextInt();

        System.out.print("Enter angle (in degrees): ");
        double angle = sc.nextDouble();

        // перевод в радианы
        double radians = Math.toRadians(angle);

        switch (choice) {
            case 1:
                System.out.println("sin = " + Math.sin(radians));
                break;
            case 2:
                System.out.println("cos = " + Math.cos(radians));
                break;
            case 3:
                System.out.println("tan = " + Math.tan(radians));
                break;
            default:
                System.out.println("Error");
        }
    }
}