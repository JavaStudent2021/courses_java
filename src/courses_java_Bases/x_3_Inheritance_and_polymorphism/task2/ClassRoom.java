package courses_java_Bases.x_3_Inheritance_and_polymorphism.task2;

public class ClassRoom {
    public ClassRoom(Pupil[] pupil) {
        for (Pupil p1: pupil) {
            System.out.println("Name student - " + p1.getNameStudent());
            p1.read();
            p1.relax();
            p1.write();
            p1.study();
            System.out.println("*************************************************");
        }
    }
}
