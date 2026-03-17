public class DevicesMain {
    public static void main(String[] args) {
        // Создаём объекты устройств
        Laptop laptop = new Laptop("Dell", 65);
        Smartphone phone = new Smartphone("Samsung", 25);
        Tablet tablet = new Tablet("Apple", 18);

        // Включаем устройства
        laptop.turnOn();
        phone.turnOn();
        tablet.turnOn();
    }
}

// Базовый класс Device
class Device {
    protected String brand;
    protected int power; // мощность в Вт

    public Device(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    // Метод turnOn(), может быть переопределён
    public void turnOn() {
        System.out.println(brand + " устройство включено. Мощность: " + power + " Вт");
    }
}

// Класс-наследник Laptop
class Laptop extends Device {
    public Laptop(String brand, int power) {
        super(brand, power);
    }

    @Override
    public void turnOn() {
        System.out.println(brand + " ноутбук включён. Мощность: " + power + " Вт");
    }
}

// Класс-наследник Smartphone
class Smartphone extends Device {
    public Smartphone(String brand, int power) {
        super(brand, power);
    }

    @Override
    public void turnOn() {
        System.out.println(brand + " смартфон включён. Мощность: " + power + " Вт");
    }
}

// Класс-наследник Tablet
class Tablet extends Device {
    public Tablet(String brand, int power) {
        super(brand, power);
    }

    @Override
    public void turnOn() {
        System.out.println(brand + " планшет включён. Мощность: " + power + " Вт");
    }
}