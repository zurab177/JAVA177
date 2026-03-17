public class InstrumentsMain {
    public static void main(String[] args) {
        // Создаём объекты инструментов
        Guitar guitar = new Guitar("Fender");
        Piano piano = new Piano("Yamaha");
        Drums drums = new Drums("Pearl");

        // Вызываем метод playSound()
        guitar.playSound();
        piano.playSound();
        drums.playSound();
    }
}

// Базовый класс Instrument
class Instrument {
    protected String brand;

    public Instrument(String brand) {
        this.brand = brand;
    }

    // Метод playSound() – будет переопределяться в наследниках
    public void playSound() {
        System.out.println(brand + " инструмент издаёт звук.");
    }
}

// Класс-наследник Guitar
class Guitar extends Instrument {
    public Guitar(String brand) {
        super(brand);
    }

    @Override
    public void playSound() {
        System.out.println(brand + " гитара звучит: Трррр!");
    }
}

// Класс-наследник Piano
class Piano extends Instrument {
    public Piano(String brand) {
        super(brand);
    }

    @Override
    public void playSound() {
        System.out.println(brand + " пианино звучит: Динь-дон!");
    }
}

// Класс-наследник Drums
class Drums extends Instrument {
    public Drums(String brand) {
        super(brand);
    }

    @Override
    public void playSound() {
        System.out.println(brand + " барабаны звучат: Бум-бум!");
    }
}