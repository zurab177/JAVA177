class Car {
    String brand;
    int speed;

    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}

class Sedan extends Car {

    Sedan(String brand, int speed) {
        super(brand, speed);
    }

    void fuelConsumption() {
        System.out.println("Sedan fuel consumption: 7 liters/100km");
    }
}

public class Task1 {

    public static void main(String[] args) {

        Sedan sedan = new Sedan("Toyota", 180);

        sedan.displayInfo();
        sedan.fuelConsumption();
    }
}