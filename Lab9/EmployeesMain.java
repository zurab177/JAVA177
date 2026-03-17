public class EmployeesMain {
    public static void main(String[] args) {
        // Создаём объекты сотрудников
        Manager manager = new Manager("Иван Иванов", 150000);
        Developer developer = new Developer("Анна Петрова", 120000);
        Designer designer = new Designer("Олег Смирнов", 100000);

        // Вызываем метод work() для каждого сотрудника
        manager.work();
        developer.work();
        designer.work();
    }
}

// Базовый класс Employee
class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Метод work() – будет переопределяться в наследниках
    public void work() {
        System.out.println(name + " выполняет свою работу.");
    }
}

// Класс-наследник Manager
class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println(name + " управляет командой. Зарплата: " + salary);
    }
}

// Класс-наследник Developer
class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println(name + " пишет код. Зарплата: " + salary);
    }
}

// Класс-наследник Designer
class Designer extends Employee {
    public Designer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println(name + " создаёт дизайн. Зарплата: " + salary);
    }
}