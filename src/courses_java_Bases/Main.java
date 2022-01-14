package courses_java_Bases;

public class Main {
    public static void test(int... a) {
        System.out.println("int");
    }
    public static void test(Integer... a) {
        System.out.println("Integer");
    }

    public static void test(Number... a) {
        System.out.println("Number");
    }

    public static void main(String args[]) {
        Number n = new Integer(1);
        //test(n.intValue());
    }
}
