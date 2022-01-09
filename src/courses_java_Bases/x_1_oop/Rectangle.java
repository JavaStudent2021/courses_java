package courses_java_Bases.x_1_oop;

public class Rectangle {
    double side1;
    double side2;

    double areaCalculator(double side1, double side2) {
        return side1 * side2;
    }

    double perimeterCalculator(double side1, double side2) {
        return (side1 + side2) * 2;
    }
}
