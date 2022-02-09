package courses_java_Advanced.x_2_CollectionFramework;

import courses_java_Advanced.x_2_CollectionFramework.task2.Task2;
import courses_java_Advanced.x_2_CollectionFramework.task3.Test3;
import courses_java_Advanced.x_2_CollectionFramework.task4.Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {


        /*
        Задание 1
        В любой из профильных книг (Хорстман, Эккель) найти соответствующие темы и закрепить материал.
        Использование YouTube, Quizful приветствуется.
        */
        System.out.println("Задание 1");
        System.out.println("-------------------------------------");

        /*
        Задание 2
        Используя коллекцию удвойте слово:
        1.       Введите с клавиатуры 5 слов в список строк.
        2.       Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
        3.       Используя цикл for выведите результат на экран, каждое значение с новой строки.
        */
        System.out.println("Задание 2");
        ArrayList list = new ArrayList<>();
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            try {
                list.add(reader1.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        new Task2().doubleValues(list).forEach(x-> System.out.println(x));


        System.out.println("-------------------------------------");


        /*
        Задание 3
        Минимальное из N чисел(использовать LinkedList):
        1.       Ввести с клавиатуры число N.
        2.       Считать N целых чисел и заполнить ими список - метод getIntegerList.
        3.       Найти минимальное число среди элементов списка - метод getMinimum.
        */
        System.out.println("Задание 3");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        Test3 test3 = new Test3();

        test3.getIntegerList(n);
        test3.getMinimum(test3.list);

        System.out.println("-------------------------------------");

        /*
        Задание 4
        Программа определяет, какая семья (фамилия) живёт в городе:
        Пример ввода:
        ·         Москва
        ·         Ивановы
        ·         Киев
        ·         Петровы
        ·         Лондон
        ·         Абрамовичи
        ·         Лондон
        Пример вывода:
        ·         Абрамовичи
        */
        System.out.println("Задание 4");
        LinkedList<Task4> task4 = new LinkedList<>();
        String[] line = new String[]{"Москва", "Ивановы", "Киев", "Петровы", "Лондон", "Абрамовичи", "Лондон"};
        for (int i = 0; i < line.length; i++) {
            if (i + 2 <= line.length) {
                task4.add(new Task4(line[i], line[i + 1]));
            } else {
                for (Task4 d : task4) {
                    String name = d.lastName;
                    if (d.cityName == line[i]) {
                        System.out.println("lastName = " + name);
                    }
                }
            }
        }


        System.out.println("-------------------------------------");

        /*
        Задание 5
        Вводить с клавиатуры строки, пока пользователь не введёт строку 'end':
        1.       Создать список строк.
        2.       Ввести строки с клавиатуры и добавить их в список.
        3.       Вводить с клавиатуры строки, пока пользователь не введёт строку "end".  "end" не учитывать.
        4.       Вывести строки на экран, каждую с новой строки.
        */
        System.out.println("Задание 5");
        ArrayList<String> list1 = new ArrayList<>();
        try (BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in))) {
            String str = reader2.readLine();
            while (!str.equals("end")) {
                list1.add(str);
                str = reader2.readLine();
            }
            list1.forEach(System.out::println);
        }

        System.out.println("-------------------------------------");

    }
}
