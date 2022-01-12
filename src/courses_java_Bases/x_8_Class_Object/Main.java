package courses_java_Bases.x_8_Class_Object;

import courses_java_Bases.x_8_Class_Object.task2.Device;
import courses_java_Bases.x_8_Class_Object.task2.Monitor;
import courses_java_Bases.x_8_Class_Object.task5.Animal;

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
        Создать классы:
        1) Основной класс Device (manufacturer(String), price(float), serialNumber(String));
        2) Сабкалсс Monitor (resolutionX(int), resolutionY(int)) and EthernetAdapter (speed (int), mac (String));
        Добавить методы доступа. Конструктор.
        */
        System.out.println("Задание 2");
        System.out.println(new Device()); ///??????
        System.out.println("-------------------------------------");
        /*
        Задание 3
        Смотреть задание 2.
        В обоих классах переопределить метод toString, что бы вывод был следующим:
        Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
        Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280,Y=1024
        */
        System.out.println("Задание 3");
        Monitor monitor = new Monitor("Samsung",120,"AB1234567CD",1280,1024);
        System.out.println(monitor); ///??????
        System.out.println("-------------------------------------");


        /*
        Задание 4
        Смотреть задание 2.
        Переопределить методы equals & hashCode в каждом классе.
        Создать класс Main, в котором создать объекты классов и продемонстрировать переопределенные методы.
        */
        System.out.println("Задание 4");
        new courses_java_Bases.x_8_Class_Object.task4.Main("Den", 5);
        System.out.println("-------------------------------------");

        /*
        Задание 5
        Используя Intelij IDEA создать проект, пакет.
        Создать класс Animal с именем String, возрастом int, хвостом Boolean.
        В классе переопределить метод toString, что бы вывод был сдедующим «Имя: Васька, возраст: 45, хвост: нет».
        В классе Animal переопределить методы equals & hashCode.
        */
        System.out.println("Задание 5");
        System.out.println(new Animal("Васька", 45, false));
        System.out.println("-------------------------------------");
    }
}
