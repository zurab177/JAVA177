public class CharactersMain {
    public static void main(String[] args) {
        // Создаём объекты персонажей
        Warrior warrior = new Warrior("Рыцарь");
        Mage mage = new Mage("Маг");
        Archer archer = new Archer("Лучник");

        // Вызываем метод атаки
        warrior.attack();
        mage.attack();
        archer.attack();
    }
}

// Базовый класс Character
class Character {
    protected String name;

    public Character(String name) {
        this.name = name;
    }

    // Метод attack() – будет переопределяться в наследниках
    public void attack() {
        System.out.println(name + " атакует.");
    }
}

// Класс-наследник Warrior
class Warrior extends Character {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + " наносит удар мечом!");
    }
}

// Класс-наследник Mage
class Mage extends Character {
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + " колдует заклинание огня!");
    }
}

// Класс-наследник Archer
class Archer extends Character {
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + " стреляет из лука!");
    }
}