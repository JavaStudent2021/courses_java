package courses_java_Bases.x_6_Static_and_Nested_Classes_Anonymous_classes_and_Enums.task4;

public enum Vehicles {
    BMV(20000, "red");
    private int cost = 0;
    private String color;

    Vehicles(int cost, String color) {
        this.cost = cost;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "name = " + name() +
                "; color = " + getColor() +
                "; cost = " + cost +
                '}';
    }
}
