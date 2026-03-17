public class ShopMain {
    public static void main(String[] args) {
        // Создаём объекты товаров
        Food apple = new Food("Яблоко", 50);
        Electronics laptop = new Electronics("Ноутбук", 120000);
        Clothes tshirt = new Clothes("Футболка", 2500);

        // Выводим цены товаров
        apple.showPrice();
        laptop.showPrice();
        tshirt.showPrice();
    }
}

// Базовый класс Product
class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Метод showPrice() – будет переопределяться в наследниках
    public void showPrice() {
        System.out.println(name + " цена: " + price + " руб.");
    }
}

// Класс-наследник Food
class Food extends Product {
    public Food(String name, double price) {
        super(name, price);
    }

    @Override
    public void showPrice() {
        System.out.println("Продукт: " + name + ", цена: " + price + " руб.");
    }
}

// Класс-наследник Electronics
class Electronics extends Product {
    public Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    public void showPrice() {
        System.out.println("Электроника: " + name + ", цена: " + price + " руб.");
    }
}

// Класс-наследник Clothes
class Clothes extends Product {
    public Clothes(String name, double price) {
        super(name, price);
    }

    @Override
    public void showPrice() {
        System.out.println("Одежда: " + name + ", цена: " + price + " руб.");
    }
}