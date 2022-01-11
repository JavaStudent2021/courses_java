package courses_java_Bases.x_7_Exceptions;

import courses_java_Bases.x_7_Exceptions.task2.Worker;
import courses_java_Bases.x_7_Exceptions.task3.Price;
import courses_java_Bases.x_7_Exceptions.task5.Calculator;

import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

public class Main {
    public static void main(String[] args) {


        /*
        Задание 1
        Выучите основные конструкции и понятия, рассмотренные на уроке.
        */

        /*
        Задание 2
        Создайте проект, используя IntelliJ IDEA.
        Требуется: Описать класс с именем Worker, содержащую следующие поля:
          фамилия и инициалы работника;
          название занимаемой должности;
          год поступления на работу.
        Написать программу, выполняющую следующие действия:
          ввод с клавиатуры данных в массив, состоящий из пяти элементов типа Worker (записи должны быть упорядочены по алфавиту);
          если значение года введено не в соответствующем формате выдает исключение.
          вывод на экран фамилии работника, стаж работы которого превышает введенное значение.
        */

        /*try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String nameWorker = reader.readLine();
            String postWorker = reader.readLine();
            String data = reader.readLine();
            //String dateStartWork = new SimpleDateFormat("dd-MM-yyyy").format(new SimpleDateFormat("dd-MM-yyyy").parse(data));
            Date dateStartWork = new SimpleDateFormat("dd-MM-yyyy").parse(data);
            Worker worker = new Worker(nameWorker, postWorker, dateStartWork);
            System.out.println(worker);
        } catch (Exception e) {
            System.out.println("Дата сотрудника введена некоректно");
            ;
        }*/



        /*
        Задание 3
        Создайте проект, используя IntelliJ IDEA.
        Требуется: Описать класс с именем Price, содержащую следующие поля:
          название товара;
          название магазина, в котором продается товар;
          стоимость товара в гривнах.
         Написать программу, выполняющую следующие действия:
          ввод с клавиатуры данных в массив, состоящий из двух элементов типа Price (записи должны быть упорядочены в алфавитном порядке по названиям магазинов);
          вывод на экран информации о товарах, продающихся в магазине, название которого введено с клавиатуры (если такого магазина нет, вывести исключение).
        */

        ArrayList<Price> liStory = new ArrayList<>();
        liStory.add(new Price("Car", "ATB", 20_000));
        liStory.add(new Price("Bicycle", "ATB", 5_000));
        liStory.forEach(e -> System.out.println(e));



        /*
        Задание 4
        Зайдите на сайт Oracle.
        Используя поисковые механизмы Oracle, найдите самостоятельно описание темы по каждому примеру, который был рассмотрен на уроке,
        так, как это представлено ниже, в разделе «Рекомендуемые ресурсы», описания данного урока. Сохраните ссылки и дайте им короткое описание.
        */


        /*
        Задание 5
        Создайте проект, используя IntelliJ IDEA.
        Создайте класс Calculator.
        В теле класса создайте четыре метода для арифметических действий: (add – сложение, sub – вычитание, mul – умножение, div – деление).
        Метод деления должен делать проверку деления на ноль, если проверка не проходит, сгенерировать исключение.
        Пользователь вводит значения, над которыми хочет произвести операцию и выбрать саму операцию.
        При возникновении ошибок должны выбрасываться исключения.
        */

        Calculator calculator = new Calculator();
        System.out.println(calculator.div(2,0));


    }
}
