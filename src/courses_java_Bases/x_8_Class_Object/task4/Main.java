package courses_java_Bases.x_8_Class_Object.task4;

import java.util.Objects;

public class Main {
    private String name;
    private int age;

    public Main(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Main() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Main main = (Main) o;
        return age == main.age && Objects.equals(name, main.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
