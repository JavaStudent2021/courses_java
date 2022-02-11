package courses_java_Advanced.x_5_Reflection;

import courses_java_Advanced.x_5_Reflection.task2.Task2;
import courses_java_Advanced.x_5_Reflection.task3.Task3;
import courses_java_Advanced.x_5_Reflection.task4.Animal;
import courses_java_Advanced.x_5_Reflection.task4.Cat;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {


        /*
        Задание 1
        В любой из профильных книг (Хорстман, Эккель) найти соответствующие темы и закрепить материал.
        Использование YouTube, Quizful приветствуется.
        */
        System.out.println("Задание 1");
        System.out.println("-------------------------------------");

        /*
        Задание 2
        Напишите программу, которая будет выводить всю информацию о классе, пользователь сам выбирает,
        какой именно класс интересует.
        */
        System.out.println("Задание 2");
        Task2 task2 = new Task2();
        Class<?> c1 = task2.getClass();
        System.out.println(c1.getSimpleName());
        System.out.println(c1.getEnclosingMethod());
        System.out.println(c1.getDeclaredMethods().length);

        System.out.println("-------------------------------------");


        /*
        Задание 3
        Создайте класс, в нем определите 3 поля, к этим полям создайте конструкторы и методы.
        Под средством рефлексии получите всю информацию о полях, методах, конструкторах,
        а также модификаторах доступа.
        */
        System.out.println("Задание 3");
        Task3 task3 = new Task3();
        Class<?> c3 = task3.getClass();
        Arrays.stream(c3.getDeclaredMethods()).forEach(e-> System.out.println(e.getName()));
        System.out.println("===================");
        Arrays.stream(c3.getMethods()).forEach(e-> System.out.println(e.getName()));
        System.out.println("===================");
        Arrays.stream(c3.getDeclaredFields()).forEach(e-> System.out.println(e.getName()));
        System.out.println("===================");
        Arrays.stream(c3.getDeclaredFields()).forEach(e-> System.out.println(e.getModifiers()));
        System.out.println("===================");
        Arrays.stream(c3.getConstructors()).forEach(e-> System.out.println("param. in construct : " + Arrays.stream(e.getParameters()).count()));
        System.out.println("===================");
        System.out.println("-------------------------------------");

        /*
        Задание 4
        Создайте 2 класса, Animal и Cat. В классе Animal инициализируйте 3 поля различных модификаторов.
        В классе Cat используя рефлексию получите доступ к полям класса Animal и измените содержимое каждого из полей.
        */
        System.out.println("Задание 4");
        Cat cat = new Cat();
        System.out.println("animal");
        cat.setAnimalFild();
        System.out.println("in upd animal ");
        System.out.println("-------------------------------------");

    }
}
