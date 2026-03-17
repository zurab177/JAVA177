public class SportsTeamMain {
    public static void main(String[] args) {
        // Создаём объекты членов команды
        Player player = new Player("Алексей");
        Coach coach = new Coach("Ирина");
        Doctor doctor = new Doctor("Сергей");

        // Вызываем методы
        player.play();
        coach.train();
        doctor.heal();
    }
}

// Базовый класс TeamMember
class TeamMember {
    protected String name;

    public TeamMember(String name) {
        this.name = name;
    }
}

// Класс-наследник Player
class Player extends TeamMember {
    public Player(String name) {
        super(name);
    }

    public void play() {
        System.out.println(name + " играет на поле.");
    }
}

// Класс-наследник Coach
class Coach extends TeamMember {
    public Coach(String name) {
        super(name);
    }

    public void train() {
        System.out.println(name + " проводит тренировку команды.");
    }
}

// Класс-наследник Doctor
class Doctor extends TeamMember {
    public Doctor(String name) {
        super(name);
    }

    public void heal() {
        System.out.println(name + " лечит игроков команды.");
    }
}