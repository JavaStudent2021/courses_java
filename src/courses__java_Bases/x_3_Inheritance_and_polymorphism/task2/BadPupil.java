package courses__java_Bases.x_3_Inheritance_and_polymorphism.task2;

public class BadPupil extends Pupil {


    @Override
    void study() {
        super.study();
        setGrade(5);
    }

    @Override
    void read() {
        super.read();
    }

    @Override
    void write() {
        super.write();
    }

    @Override
    void relax() {
        super.relax();
    }
}
