public class VehiclesMain {
    public static void main(String[] args) {
        // Создаём объекты транспортных средств
        Bike bike = new Bike("Yamaha");
        Bus bus = new Bus("Mercedes");
        Taxi taxi = new Taxi("Toyota");

        // Запускаем двигатели
        bike.startEngine();
        bus.startEngine();
        taxi.startEngine();
    }
}

// Базовый класс Vehicle
class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Метод startEngine(), может быть переопределён
    public void startEngine() {
        System.out.println(brand + " двигатель запущен.");
    }
}

// Класс-наследник Bike
class Bike extends Vehicle {
    public Bike(String brand) {
        super(brand);
    }

    @Override
    public void startEngine() {
        System.out.println(brand + " мотоцикл заводится: Брррр!");
    }
}

// Класс-наследник Bus
class Bus extends Vehicle {
    public Bus(String brand) {
        super(brand);
    }

    @Override
    public void startEngine() {
        System.out.println(brand + " автобус заводится: Брум-брум!");
    }
}

// Класс-наследник Taxi
class Taxi extends Vehicle {
    public Taxi(String brand) {
        super(brand);
    }

    @Override
    public void startEngine() {
        System.out.println(brand + " такси заводится: Врум-врум!");
    }
}