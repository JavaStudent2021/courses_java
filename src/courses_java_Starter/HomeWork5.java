package courses_java_Starter;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork5 {
    public static void main(String[] args) throws IOException {

        /*
        Задание 2
        Известно, что у четных чисел младший бит имеет значение 0 Используя IntelliJ IDEA, создайте класс Parity.
        Напишите программу, которая будет выполнять проверку чисел на четность. Предложите два варианта решения поставленной задачи.
        */
        System.out.println("Задание 2");
        //new Parity().parity(5);
        System.out.println("-------------------------------------");

        /*
        Задание 3
        Используя IntelliJ IDEA, создайте класс LogicOperations. Имеется 3 переменные типа int x = 5, y = 10, и z = 15;
        Выполните и рассчитайте результат следующих операций для этих переменных:
         x += y >> x++ * z;
         z = ++x & y * 5;
         y /= x + 5 | z;
         z = x++ & y * 5;
         x = y << x++ ^ z;
        */
        System.out.println("Задание 3");
        //new LogicOperations().logicOperations();
        System.out.println("-------------------------------------");

        /*
        Задание 4
        Используя IntelliJ IDEA, создайте класс Premium. Напишите программу расчета начисления премий сотрудникам.
        Премии рассчитываются согласно выслуге лет.
        Если выслуга до 5 лет, премия составляет 10% от заработной платы.
        Если выслуга от 5 лет (включительно) до 10 лет, премия составляет 15% от заработной платы.
        Если выслуга от 10 лет (включительно) до 15 лет, премия составляет 25% от заработной платы.
        Если выслуга от 15 лет (включительно) до 20 лет, премия составляет 35% от заработной платы.
        Если выслуга от 20 лет (включительно) до 25 лет, премия составляет 45% от заработной платы.
        Если выслуга от 25 лет (включительно) и более, премия составляет 50% от заработной платы.
        Результаты расчета, выведите на экран.
        */
        System.out.println("Задание 4");
        //new Premium().visluga();
        System.out.println("-------------------------------------");

        /*
        Задание 5
        Известно, что у чисел, которые являются степенью двойки, только один бит имеет значение 1.
        Используя IntelliJ IDEA, создайте класс PowerOfTwo.
        Напишите программу, которая будет выполнять проверку – является ли указанное число степенью двойки или нет.
        */
        System.out.println("Задание 5");

        System.out.println("-------------------------------------");


        /*
        Задание 6
        Используя IntelliJ IDEA, создайте класс DeMorganComparison.
        Используя теорему Де Моргана, преобразуйте исходное выражение A | B, в эквивалентное выражение.
        */
        System.out.println("Задание 6");
        int a = 2, b = 4;
        if (a > 1 | b > 2) System.out.println(a | b);
        if (a > 1 || b > 2) System.out.println(a > 1 || b > 2);
        System.out.println("-------------------------------------");


    }

    static class Parity {
        void parity(int x) {
            if (x % 2 == 0) {
                System.out.println("Данное число - " + x + " являэться четним.");
            } else {
                System.out.println("Данное число - " + x + " являэться нечетним.");
            }
        }
    }

    static class LogicOperations {
        int x = 5, y = 10, z = 15;

        void logicOperations() {
            System.out.println("x = 5, y = 10, z = 15");
            x += y >> x++ * z;
            System.out.println("(x += y >> x++ * z) = " + x);
            z = ++x & y * 5;
            System.out.println("(z = ++x & y * 5) = " + z);
            y /= x + 5 | z;
            System.out.println("(y /= x + 5 | z) = " + y);
            z = x++ & y * 5;
            System.out.println("(z = x++ & y * 5) = " + z);
            x = y << x++ ^ z;
            System.out.println("(x = y << x++ ^ z) = " + x);
        }
    }

    static class Premium {
        public double zp = 0.0;

        public Premium() throws IOException {
            System.out.println("Расчет премии. \n Введите вашу з/п ': ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            zp = Double.parseDouble(reader.readLine());
        }

        void visluga() throws IOException {
            double res = 0;
            System.out.println("Расчет премии. \n Введите кол-во лет 'вислуга': ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int age = Integer.parseInt(reader.readLine());
            if (0 <= age & age < 5) {
                res = zp * 10 / 100;
            } else if (5 <= age & age < 10) {
                res = zp * 15 / 100;
            } else if (10 <= age & age < 15) {
                res = zp * 25 / 100;
            } else if (15 <= age & age < 20) {
                res = zp * 35 / 100;
            } else if (20 <= age & age < 25) {
                res = zp * 45 / 100;
            } else if (20 <= age) {
                res = zp * 50 / 100;
            }
            System.out.println("Премия - " + res);
        }

    }

    static class PowerOfTwo {
        void powerOfTwo() {

        }
    }
}
