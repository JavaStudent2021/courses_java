package courses_java_Advanced.x_5_Reflection.task3;

public class Task3 {
    public String firstName = "Vasy";
    protected String  lastName = "Dendy";
    private int age = 10;

    public Task3() {
    }

    public Task3(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
