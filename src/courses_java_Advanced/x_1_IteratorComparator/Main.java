package courses_java_Advanced.x_1_IteratorComparator;

import courses_java_Advanced.x_1_IteratorComparator.task2.Task2;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

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
        Вывод на экран элементов List:
        Создать список, заполнить его на 10 элементов и вывести на экран содержимое используя iterator.
        */
        System.out.println("Задание 2");

        Iterator<Integer> iterator = new Task2().list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("\n-------------------------------------");

        /*
        Задание 3
        В папке с примерами ex_004_comparable. ????????
        Дописать логику, чтобы метод compareTo()
        осуществил поиск по скорости(если же скорость у 2-х объектов равна, то ищем по цене) -> цене -> моделе -> цвету машины.
        */
        System.out.println("Задание 3");
        System.out.println("-------------------------------------");
    }
}
