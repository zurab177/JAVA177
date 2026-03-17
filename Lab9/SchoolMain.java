public class SchoolMain {
    public static void main(String[] args) {
        // Создаём объекты разных людей
        Student student = new Student("Алина");
        Teacher teacher = new Teacher("Игорь");
        Administrator admin = new Administrator("Светлана");

        // Вызываем методы
        student.study();
        teacher.teach();
        admin.manage();
    }
}

// Базовый класс Person
class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }
}

// Класс-наследник Student
class Student extends Person {
    public Student(String name) {
        super(name);
    }

    public void study() {
        System.out.println(name + " учится в учебном заведении.");
    }
}

// Класс-наследник Teacher
class Teacher extends Person {
    public Teacher(String name) {
        super(name);
    }

    public void teach() {
        System.out.println(name + " преподаёт в учебном заведении.");
    }
}

// Класс-наследник Administrator
class Administrator extends Person {
    public Administrator(String name) {
        super(name);
    }

    public void manage() {
        System.out.println(name + " управляет учебным заведением.");
    }
}