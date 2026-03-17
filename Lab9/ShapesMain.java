// ShapesMain.java
public class ShapesMain {
    public static void main(String[] args) {
        // Создаём объекты фигур
        Circle circle = new Circle(5);             // радиус 5
        Rectangle rectangle = new Rectangle(4, 6); // ширина 4, высота 6
        Triangle triangle = new Triangle(3, 7);    // основание 3, высота 7

        // Выводим площади
        System.out.println("Площадь круга: " + circle.area());
        System.out.println("Площадь прямоугольника: " + rectangle.area());
        System.out.println("Площадь треугольника: " + triangle.area());
    }
}

// Базовый абстрактный класс Shape
abstract class Shape {
    public abstract double area();
}

// Класс-наследник Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Класс-наследник Rectangle
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

// Класс-наследник Triangle
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}