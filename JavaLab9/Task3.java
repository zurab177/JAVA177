class Person {

    String firstName;
    String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void displayInfo() {
        System.out.println(firstName + " " + lastName);
    }
}

class Student extends Person {

    Student(String firstName, String lastName) {
        super(firstName, lastName);
    }

    void study() {
        System.out.println(firstName + " is studying");
    }
}

class Professor extends Person {

    Professor(String firstName, String lastName) {
        super(firstName, lastName);
    }

    void teach() {
        System.out.println(firstName + " is teaching");
    }
}

public class Task3 {

    public static void main(String[] args) {

        Student student = new Student("Ali", "Khan");
        Professor professor = new Professor("John", "Doe");

        student.displayInfo();
        student.study();

        professor.displayInfo();
        professor.teach();
    }
}