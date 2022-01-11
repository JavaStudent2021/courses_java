package courses_java_Bases.x_6_Static_and_Nested_Classes_Anonymous_classes_and_Enums.task2;

public enum Animals {
    CAT(5),
    DOG(2),
    MONKEY(5);
    private int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animals{"  +
                "name = " + name() +
                "; age = " + age +
                '}';
    }
}
