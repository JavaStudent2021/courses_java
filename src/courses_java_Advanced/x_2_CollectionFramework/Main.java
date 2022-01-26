package courses_java_Advanced.x_2_CollectionFramework;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
      /*  ArrayList list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            try {
                list.add(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        new Task2().doubleValues(list).forEach(x-> System.out.println(x));
        */

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
        int x = reader.read();
        for (int i = 0; i < x; i++) {
            t.getIntegerList(reader.readLine());
        }


        new Test3();
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
        System.out.println("-------------------------------------");

    }
}
