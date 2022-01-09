package courses_java_Bases.x_3_Inheritance_and_polymorphism.task2;

public class BadPupil extends Pupil {

    public BadPupil(String nameStudent) {
        super(nameStudent);
        setGrade(2);
    }

    @Override
    void study() {
        System.out.println("Оценка успеваемости - " + getGrade());
    }

    @Override
    void read() {
        System.out.println("Оценка за чтение - " + getGrade());
    }

    @Override
    void write() {
        System.out.println("Оценка за письмо - " + getGrade());
    }

    @Override
    void relax() {
        System.out.println("Оценка за отдых - " + getGrade());
    }
}
