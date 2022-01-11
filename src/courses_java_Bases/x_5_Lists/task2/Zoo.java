package courses_java_Bases.x_5_Lists.task2;

import java.util.ArrayList;

public class Zoo {
    private String namePet;
    private int age;
    public static ArrayList<Zoo> listPet = new ArrayList<>();

    public Zoo(String namePet, int age) {
        this.namePet = namePet;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "namePet='" + namePet + '\'' +
                ", age=" + age +
                '}';
    }
}
