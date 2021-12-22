package courses__java_Bases.x_2_Classes_and_Objects;

public class Car_3 {
    private int age;
    private double speed;
    private int weight;
    private  String color;

    public Car_3() {
    }

    public Car_3(int age) {
        this.age = age;
    }

    public Car_3(int age, double speed) {
        this(age);
        this.speed = speed;
    }

    public Car_3(int age, double speed, int weight) {
        this(age,speed);
        this.weight = weight;
    }

    public Car_3(int age, double speed, int weight, String color) {
        this(age,speed,weight);
        this.color = color;
    }
}
