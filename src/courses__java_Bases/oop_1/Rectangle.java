package courses__java_Bases.oop_1;

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
