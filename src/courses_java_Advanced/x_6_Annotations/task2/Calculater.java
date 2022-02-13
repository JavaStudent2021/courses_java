package courses_java_Advanced.x_6_Annotations.task2;

/**
 * @author Viktor Ustenko
 */
public class Calculater {

    /**
     * peremenay X and Y
     */
    private double x;
    private double y;

    /**
     * This is a constructor to initialize calculate object.
     */

    @Calc(numX = 5, numY = 7)
    public void addTwoNumbers(int numX, int numY) {
        System.out.println(numX + numY);
    }

    ;
}
