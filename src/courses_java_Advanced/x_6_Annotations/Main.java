package courses_java_Advanced.x_6_Annotations;

import courses_java_Advanced.x_6_Annotations.task2.Calc;
import courses_java_Advanced.x_6_Annotations.task2.Calculater;
import courses_java_Advanced.x_6_Annotations.task3.Car;
import courses_java_Advanced.x_6_Annotations.task3.SportCar;
import courses_java_Advanced.x_6_Annotations.task3.miniGar;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {


        /*
        Задание 1
        В любой из профильных книг (Хорстман, Эккель) найти соответствующие темы и закрепить материал.
        Использование YouTube, Quizful приветствуется.
        */
        System.out.println("Задание 1");
        System.out.println("-------------------------------------");

        /*
        Задание 2
        Написать калькулятор с использованием аннотаций, аннотация передает 2 параметра.
        Сделать полную документацию всех полей, методов, конструкторов класса используя аннотацию Documented,
        либо же документационные комментарии.
        */
        System.out.println("Задание 2");
        Calculater calculater = new Calculater();
        Class<?> c = calculater.getClass();
        Calc calc = c.getDeclaredMethod("addTwoNumbers", int.class, int.class).getAnnotation(Calc.class);
        calculater.addTwoNumbers(calc.numX(), calc.numY());

        System.out.println("-------------------------------------");

        /*
        Задание 3
        Создайте несколько классов, один класс наследует другой и использует аннотацию Inherited.
        Помимо этого, попробуйте ещё в проекте использовать 5 различных аннотаций.
        */
        System.out.println("Задание 3");
        SportCar car = new miniGar();
        car.driver();
        System.out.println("-------------------------------------");


        /*
        Задание 4
        Создать свою аннотацию, которая будет содержать параметры для метода, выполнить сложение 2-х чисел.
        @Math(num1 = 100, num2 = 200)
        public void mathSum(int num1, int num2)
        */
        System.out.println("Задание 4");
        System.out.println("-------------------------------------");


    }
}
