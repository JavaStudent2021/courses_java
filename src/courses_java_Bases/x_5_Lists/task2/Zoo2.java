package courses_java_Bases.x_5_Lists.task2;

public class Zoo2 {
    private String namePet;
    private int age;

    public Zoo2(String namePet, int age) {
        this.namePet = namePet;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Zoo2{" +
                "namePet='" + namePet + '\'' +
                ", age=" + age +
                '}';
    }
}
