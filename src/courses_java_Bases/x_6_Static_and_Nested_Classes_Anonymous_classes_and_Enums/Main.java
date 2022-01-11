package courses_java_Bases.x_6_Static_and_Nested_Classes_Anonymous_classes_and_Enums;

import courses_java_Bases.x_6_Static_and_Nested_Classes_Anonymous_classes_and_Enums.task2.Animals;
import courses_java_Bases.x_6_Static_and_Nested_Classes_Anonymous_classes_and_Enums.task4.Vehicles;

public class Main {
    public static void main(String[] args) {

        /*
        Задание 1
        Выучите основные конструкции и понятия, рассмотренные на уроке.
        */
        System.out.println("Задание 1");
        System.out.println("-------------------------------------");

        /*
        Задание 2
        Создайте проект, используя IntelliJ IDEA.
        Создайте перечислительный тип (enum) Animals, содержащий конструктор, который должен принимать
        целочисленное значение (возраст животного), и содержать перегруженный метод toString(),
        который должен возвращать название экземпляра и возраст животного.
        */
        System.out.println("Задание 2");
        System.out.println(Animals.CAT);
        System.out.println("-------------------------------------");

        /*
        Задание 3
        Зайдите на сайт Oracle.
        Используя поисковые механизмы Oracle, найдите самостоятельно описание темы по каждому примеру,
        который был рассмотрен на уроке, так, как это представлено ниже, в разделе «Рекомендуемые ресурсы»,
        описания данного урока. Сохраните ссылки и дайте им короткое описание.
        */
        System.out.println("Задание 3");
        System.out.println("-------------------------------------");

        /*
        Задание 4
        Создайте проект, используя IntelliJ IDEA.
        Создайте перечислительный тип (enum) Vehicles, содержащий конструктор,
        который должен принимать целочисленное значение (стоимость автомобиля), содержать метод getColor(),
        который возвращает строку с цветом автомобиля, и содержать перегруженный метод toString(),
        который должен возвращать строку с названием экземпляра, цветом и стоимостью автомобиля
        */
        System.out.println("Задание 4");
        System.out.println(Vehicles.BMV);
        System.out.println("-------------------------------------");

    }
}