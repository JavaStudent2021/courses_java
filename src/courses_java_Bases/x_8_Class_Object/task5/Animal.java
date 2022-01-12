package courses_java_Bases.x_8_Class_Object.task5;

import java.util.Objects;

public class Animal {
    private String name;
    private int age;
    private Boolean hvost;

    public Animal(String name, int age, Boolean hvost) {
        this.name = name;
        this.age = age;
        this.hvost = hvost;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "Имя: '" + name + '\'' +
                ", возраст: " + age +
                ", хвост: " + (hvost==false?"нет":"да") +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name) && Objects.equals(hvost, animal.hvost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, hvost);
    }
}

