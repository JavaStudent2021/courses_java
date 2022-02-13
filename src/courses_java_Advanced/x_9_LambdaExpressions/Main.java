package courses_java_Advanced.x_9_LambdaExpressions;

import courses_java_Advanced.x_9_LambdaExpressions.task4.Calcul;
import jdk.dynalink.Operation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        /*
        Задание 1
        В любой из профильных книг (Хорстман, Эккель) найти соответствующие темы и закрепить материал.
        Использование YouTube, Quizful приветствуется.
        */
        System.out.println("Задание 1");
        System.out.println("-------------------------------------");

        /*
        Задание 2
        Создать список и заполнить рандомными числами 10 ячеек, нужно вывести сумму квадратов всех элемента списка.
        Мы используем метод map() для возведения в квадрат каждого элемента,
        а потом применяем метод reduce() для свертки всех элементов в одно число.
        */
        System.out.println("Задание 2");
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 4; i++) {
            list.add(i);
        }
        System.out.println(list.stream().reduce((accumulator, element) -> accumulator + (element * element)).get());

        System.out.println("-------------------------------------");


        /*
        Задание 3
        Создать класс Book, сделать 3 поля и соответствующие методы.
        Необходимо реализовать замыкание анонимного класса и лямбда-выражения
        */
        System.out.println("Задание 3");
        System.out.println("-------------------------------------");


        /*
        Задание 4
        Напишите основные арифметические действия калькулятора используя лямбда-выражения
        */
        System.out.println("Задание 4");
        Calcul add = (x, y) -> x - y;
        Calcul sub = (x, y) -> x + y;
        Calcul div = (x, y) -> x / y;
        Calcul mult = (x, y) -> x * y;
        System.out.println(add.calc(5,3));
        System.out.println(sub.calc(5,3));
        System.out.println(div.calc(5,3));
        System.out.println(mult.calc(5,3));

        System.out.println("-------------------------------------");
    }
}
