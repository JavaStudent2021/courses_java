package courses_java_Advanced.x_5_Reflection.task4;

public class Animal {
    public String firstName;
    protected String listName;
    private int age = 0;

    @Override
    public String toString() {
        return "Animal{" +
                "firstName='" + firstName + '\'' +
                ", listName='" + listName + '\'' +
                ", age=" + age +
                '}';
    }
}
