package courses_java_Bases.x_5_Lists;

import courses_java_Bases.x_5_Lists.task2.Zoo;
import courses_java_Bases.x_5_Lists.task2.Zoo2;

import java.util.ArrayList;
import java.util.List;

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
        Используя Intelij IDEA создать проект, пакет. Создать класс Zoo.
        В классе создать список, в который записать 8 животных через метод add(index, element). Вывести список в консоль.
        */
        System.out.println("Задание 2");
        for (int i = 0; i < 8; i++) {
            Zoo zoo = new Zoo("Cat", i);
            Zoo.listPet.add(zoo);
        }

        Zoo.listPet.forEach(e -> System.out.println(e));
        System.out.println("listPet.size - " + Zoo.listPet.size());
        System.out.println("\n......................................\n");
        List list = new ArrayList();
        list.add(new Zoo2("Bird", 3));
        list.add(new Zoo2("Jaguar", 2));
        list.forEach(e -> System.out.println(e));


        System.out.println("-------------------------------------");

        /*
        Задание 3
        Используя Intelij IDEA создать проект, пакет.
        Используя класс Zoo Задания 2, удалить 3, 5, 7 животные, узнать размер списка и вывести в консоль.
        */
        System.out.println("Задание 3");
        Zoo.listPet.remove(7);
        Zoo.listPet.remove(5);
        Zoo.listPet.remove(3);
        System.out.println("listPet.size - " + Zoo.listPet.size());

        System.out.println("-------------------------------------");

        /*
        Задание 4
        Используя Intelij IDEA создать проект.
        */
        System.out.println("Задание 4");
        System.out.println("-------------------------------------");

        /*
        Задание 5
        Используя Intelij IDEA создать проект, пакет.
        Создать class Main, в нем создать список, добавить учителей, которых вы только сможете вспомнить со школы.
        И получить индекс самого лучшего учителя и самого не очень. Вывести список в консоль.
        */
        System.out.println("Задание 5");
        List<String> listЕeacher = new ArrayList<>();
        listЕeacher.add("Math");
        listЕeacher.add("SSSSSS");

        listЕeacher.forEach(e-> System.out.println(e));

        System.out.println("-------------------------------------");

    }
}
