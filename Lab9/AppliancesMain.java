public class AppliancesMain {
    public static void main(String[] args) {
        // Создаём объекты бытовых приборов
        Refrigerator fridge = new Refrigerator("LG");
        WashingMachine washer = new WashingMachine("Samsung");
        Microwave microwave = new Microwave("Panasonic");

        // Вызываем метод operate()
        fridge.operate();
        washer.operate();
        microwave.operate();
    }
}

// Базовый класс Appliance
class Appliance {
    protected String brand;

    public Appliance(String brand) {
        this.brand = brand;
    }

    // Метод operate() – будет переопределяться в наследниках
    public void operate() {
        System.out.println(brand + " прибор работает.");
    }
}

// Класс-наследник Refrigerator
class Refrigerator extends Appliance {
    public Refrigerator(String brand) {
        super(brand);
    }

    @Override
    public void operate() {
        System.out.println(brand + " холодильник охлаждает продукты.");
    }
}

// Класс-наследник WashingMachine
class WashingMachine extends Appliance {
    public WashingMachine(String brand) {
        super(brand);
    }

    @Override
    public void operate() {
        System.out.println(brand + " стиральная машина стирает бельё.");
    }
}

// Класс-наследник Microwave
class Microwave extends Appliance {
    public Microwave(String brand) {
        super(brand);
    }

    @Override
    public void operate() {
        System.out.println(brand + " микроволновка разогревает еду.");
    }
}