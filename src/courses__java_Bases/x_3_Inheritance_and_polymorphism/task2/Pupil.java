package courses__java_Bases.x_3_Inheritance_and_polymorphism.task2;

public class Pupil {

    private int grade;

    public String getNameStudent() {
        return nameStudent;
    }

    private String nameStudent;

    public Pupil(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    void study() {
        System.out.println("Оценка успеваемости - " + getGrade());
    }

    void read() {
        System.out.println("Оценка за чтение - " + getGrade());
    }

    void write() {
        System.out.println("Оценка за письмо - " + getGrade());
    }

    void relax() {
        System.out.println("Оценка за отдых - " + getGrade());
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
