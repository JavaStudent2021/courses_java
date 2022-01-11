package courses_java_Bases.x_4_Abstraction;

import courses_java_Bases.x_4_Abstraction.task2.DOCHandler;
import courses_java_Bases.x_4_Abstraction.task2.TXTHandler;
import courses_java_Bases.x_4_Abstraction.task2.XMLHandler;
import courses_java_Bases.x_4_Abstraction.task3.Player;

public class Main {
    public static void main(String[] args) {

        /*
        Задание 1
        Выучите основные конструкции и понятия, рассмотренные на уроке.
        */


        /*
        Задание 2
        Используя IntelliJ IDEA, создайте проект.
        Требуется: Создайте класс AbstractHandler.
        В теле класса создать методы void open(), void create(), void change(), void save().
        Создать производные классы XMLHandler, TXTHandler, DOCHandler от базового класса AbstractHandler.
        Написать программу, которая будет выполнять определение документа и для каждого формата должны быть методы открытия,
        создания, редактирования, сохранения определенного формата документа.
        */

        String nameFile = "C:\\DiskD\\jav\\er3.txt";
        /*Scanner scanner = new Scanner(System.in);
        nameFile = scanner.nextLine();*/
        String[] file = nameFile.split("\\.");
        switch (file[1]) {
            case "doc" -> new DOCHandler();
            case "txt" -> new TXTHandler().change();
            case "xml" -> new XMLHandler();
            default -> System.out.println("файл неопределенного формата");
        }



        /*
        Задание 3
        Используя IntelliJ IDEA, создайте проект.
        Требуется: Создайте 2 интерфейса Playable и Recodable.
        В каждом из интерфейсов создайте по 3 метода void play() / void pause() / void stop() и void record() / void pause() / void stop() соответственно.
        Создайте производный класс Player от базовых интерфейсов Playable и Recodable.
        Написать программу, которая выполняет проигрывание и запись.
        */
        Player player = new Player();
        player.play();
        player.record();
        player.pause();
        player.stop();






        /*
        Задание 4
        Зайдите на сайт Oracle.
        Используя поисковые механизмы Oracle, найдите самостоятельно описание темы по каждому примеру,
        который был рассмотрен на уроке, так, как это представлено ниже, в разделе «Рекомендуемые ресурсы», описания данного урока.
        Сохраните ссылки и дайте им короткое описание.
        */


        /*
        Задание 5
        Используя IntelliJ IDEA, создайте проект.
        Требуется: Изменить 12 пример первого урока (работа с документом) и создать общий абстрактный класс для всех частей документа.
        */

    }
}
