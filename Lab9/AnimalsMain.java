public class AnimalsMain {
    public static void main(String[] args) {
        // Создаём объекты животных
        Lion lion = new Lion("Симба");
        Elephant elephant = new Elephant("Дамбо");
        Monkey monkey = new Monkey("Чико");

        // Вызываем метод makeSound() для каждого животного
        lion.makeSound();
        elephant.makeSound();
        monkey.makeSound();
    }
}

// Базовый класс Animal
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    // Метод makeSound() – будет переопределяться в наследниках
    public void makeSound() {
        System.out.println(name + " издаёт звук.");
    }
}

// Класс-наследник Lion
class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " рычит: Рррр!");
    }
}

// Класс-наследник Elephant
class Elephant extends Animal {
    public Elephant(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " трубит: Пууу!");
    }
}

// Класс-наследник Monkey
class Monkey extends Animal {
    public Monkey(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " кричит: Ууу-ааа!");
    }
}