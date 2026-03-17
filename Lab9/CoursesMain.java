public class CoursesMain {
    public static void main(String[] args) {
        // Создаём объекты курсов
        ProgrammingCourse programming = new ProgrammingCourse("Java Programming");
        MathCourse math = new MathCourse("Mathematics 101");
        HistoryCourse history = new HistoryCourse("World History");

        // Запускаем курсы
        programming.startCourse();
        math.startCourse();
        history.startCourse();
    }
}

// Базовый класс Course
class Course {
    protected String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    // Метод startCourse() – будет переопределяться в наследниках
    public void startCourse() {
        System.out.println(courseName + " курс начат.");
    }
}

// Класс-наследник ProgrammingCourse
class ProgrammingCourse extends Course {
    public ProgrammingCourse(String courseName) {
        super(courseName);
    }

    @Override
    public void startCourse() {
        System.out.println("Программирование: " + courseName + " курс начинается!");
    }
}

// Класс-наследник MathCourse
class MathCourse extends Course {
    public MathCourse(String courseName) {
        super(courseName);
    }

    @Override
    public void startCourse() {
        System.out.println("Математика: " + courseName + " курс начинается!");
    }
}

// Класс-наследник HistoryCourse
class HistoryCourse extends Course {
    public HistoryCourse(String courseName) {
        super(courseName);
    }

    @Override
    public void startCourse() {
        System.out.println("История: " + courseName + " курс начинается!");
    }
}