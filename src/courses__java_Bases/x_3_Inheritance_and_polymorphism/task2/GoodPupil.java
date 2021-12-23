package courses__java_Bases.x_3_Inheritance_and_polymorphism.task2;

public class GoodPupil extends Pupil{

    public GoodPupil(String nameStudent) {
        super(nameStudent);
        setGrade(4);
    }

    @Override
    public String getNameStudent() {
        return super.getNameStudent();
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
