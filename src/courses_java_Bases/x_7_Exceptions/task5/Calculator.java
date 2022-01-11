package courses_java_Bases.x_7_Exceptions.task5;


public class Calculator {
    private int res;

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    void add() {
    } //сложение,

    void sub() {  // – вычитание
    }

    void mul() { // умножение
    }

    public int div(int x, int y) { // – деление
        try {
            setRes(x / y);
        } catch (ArithmeticException e) {
            System.out.println("/ by zero");
        }
        return getRes();
    }
}
