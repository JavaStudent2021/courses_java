package courses_java_Bases.x_2_Classes_and_Objects;

public class Test {
    private int anInt = 4;

    public Test() {
        anInt = 5;
    }

    public static void main(String[] args) {
        Test m = new Test();
        int anInt = 6;
        m.print(anInt);
    }

    public void print(int anInt) {
        System.out.println(anInt);
    }
}

