import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork7 {
    public static void main(String[] args) throws IOException {

        /*
        Задание 2
        Используя IntelliJ IDEA, создайте класс Arithmetics.
        Создайте четыре метода для выполнения арифметических операций, с именами:
        add – сложение,
        sub – вычитание,
        mul – умножение,
        div – деление.
        Каждый метод должен принимать два целочисленных аргумента и выводить на экран результат выполнения арифметической операции
        соответствующей имени метода. Метод деления div, должен выполнять проверку попытки деления на ноль.
        Требуется предоставить пользователю возможность вводить с клавиатуры значения операндов и знак арифметической операции,
        для выполнения вычислений.
        */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первый аргумент: ");
        String znac = "";
        int y = 0;
        int x = Integer.parseInt(reader.readLine());
        if (x == 0) {
            System.out.println("/by zero");
        } else {
            System.out.println("Введите другий аргумент: ");
            y = Integer.parseInt(reader.readLine());
            System.out.println("Введите знак арифметической операции: ");
            znac = reader.readLine();
        }

        //reader.close();
        System.out.println("Задание 2");
        Arithmetics arithmetics = new Arithmetics();
        switch (znac) {
            case "+":
                arithmetics.add(x, y);
                break;
            case "-":
                arithmetics.sub(x, y);
                break;
            case "*":
                arithmetics.mul(x, y);
                break;
            case "/":
                arithmetics.div(x, y);
                break;
            default:
                System.out.println("Такой арифметической операции нет.: ");
        }
        System.out.println("-------------------------------------");


        /*
        Задание 3
        Используя IntelliJ IDEA, создайте класс Conversion.
        Напишите программу, которая будет выполнять конвертирование валют.
        Пользователь вводит: сумму денег в определенной валюте, курс для конвертации в другую валюту.
        Организуйте вывод результата операции конвертирования валюты на экран.
        */
        System.out.println("Задание 3");
        new Conversion().currency();
        System.out.println("-------------------------------------");


        /*
        Задание 4
        Используя IntelliJ IDEA, создайте класс NumbersCheck.
        Напишите метод, который будет определять:
        1) является ли введенное число положительным или отрицательным.
        2) Является ли оно простым (используйте технику перебора значений).
        Простое число – это натуральное число, которое делится на 1 и само на себя.
        Чтобы определить простое число или нет, следует найти все его целые делители.
        Если делителей больше 2-х, значит оно не простое.
        3) Делится ли на 2, 5, 3, 6, 9 без остатка.
        */
        System.out.println("Задание 4");
        new NumbersCheck();
        System.out.println("-------------------------------------");

        /*
        Задание 5
        Используя IntelliJ IDEA, создайте класс Calculator.
        Создайте метод с именем calculate, который принимает в качестве параметров три целочисленных аргумента и
        выводит на экран среднее арифметическое значений аргументов.
        */
        System.out.println("Задание 5");
        new Calculator(3, 6, 2);
        System.out.println("-------------------------------------");
    }

    static class Arithmetics {
        void add(int x, int y) {
            System.out.println(x + y);
        }

        void sub(int x, int y) {
            System.out.println(x - y);
        }

        void mul(int x, int y) {
            System.out.println(x * y);
        }

        void div(int x, int y) {
            System.out.println((double) x / y);

        }

    }

    static class Conversion {
        void currency() throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите: \n первое значение это сумма денег в грн. \n второе значение курс для конвертации в другую валюту: \n");
            double grn = Double.parseDouble(reader.readLine());
            double curs = Double.parseDouble(reader.readLine());
            //reader.close();
            System.out.format("%.2f \n", (grn / curs));
        }
    }

    static class NumbersCheck {
        public NumbersCheck() throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int x = Integer.parseInt(reader.readLine());
            System.out.println(x < 0 ? "введенное число отрицательное" : "введенное число положительное");
            int n = 0;
            for (int i = 1; i <= x; i++) {
                if (x % i == 0) {
                    n++;
                }
            }
            if (n == 2) {
                System.out.println("Является простым - " + x);
            } else {
                System.out.println("Является не простым - " + x);
            }

            if (x % 2 == 0) {
                System.out.println("Делится без остатка на " + 2);
            } else System.out.println("Не делится без остатка на " + 2);
            if (x % 3 == 0) {
                System.out.println("Делится без остатка на " + 3);
            } else System.out.println("Не делится без остатка на " + 3);
            if (x % 5 == 0) {
                System.out.println("Делится без остатка на " + 5);
            } else System.out.println("Не делится без остатка на " + 5);
            if (x % 6 == 0) {
                System.out.println("Делится без остатка на " + 6);
            } else System.out.println("Не делится без остатка на " + 6);
            if (x % 9 == 0) {
                System.out.println("Делится без остатка на " + 9);
            } else System.out.println("Не делится без остатка на " + 9);
        }
    }

    static class Calculator {
        public Calculator(int x, int y, int z) {
            System.out.format("%.4f \n", (x + y + z) / 3.0);
        }
    }

}
