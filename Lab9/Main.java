// Main.java
public class Main {
    public static void main(String[] args) {
        // Создаём объекты разных транспортов
        Car car = new Car("Toyota", 120);
        Train train = new Train("Express", 200);
        Airplane airplane = new Airplane("Boeing", 900);

        // Вызываем метод move() для каждого объекта
        car.move();
        train.move();
        airplane.move();
    }
}

// Базовый класс
class Transport {
    protected String name;
    protected double speed;

    public Transport(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    public void move() {
        System.out.println(name + " движется со скоростью " + speed + " км/ч");
    }
}

// Класс-наследник Car
class Car extends Transport {
    public Car(String name, double speed) {
        super(name, speed);
    }

    @Override
    public void move() {
        System.out.println(name + " едет по дороге со скоростью " + speed + " км/ч");
    }
}

// Класс-наследник Train
class Train extends Transport {
    public Train(String name, double speed) {
        super(name, speed);
    }

    @Override
    public void move() {
        System.out.println(name + " едет по рельсам со скоростью " + speed + " км/ч");
    }
}

// Класс-наследник Airplane
class Airplane extends Transport {
    public Airplane(String name, double speed) {
        super(name, speed);
    }

    @Override
    public void move() {
        System.out.println(name + " летит в небе со скоростью " + speed + " км/ч");
    }
}