import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork8 {
    public static void main(String[] args) throws IOException {
        /*
        Задание 2
        Используя IntelliJ IDEA, создайте класс Bank.
        Представьте, что вы реализуете программу для банка, которая помогает определить, погасил ли клиент кредит или нет.
        Допустим, ежемесячная сумма платежа должна составлять 100 грн.
        Клиент должен выполнить 7 платежей, но может платить реже большими суммами.
        Т.е., может двумя платежами по 300 и 400 грн. Закрыть весь долг.
        Создайте метод, который будет в качестве аргумента принимать сумму платежа, введенную экономистом банка.
        Метод выводит на экран информацию о состоянии кредита (сумма задолженности, сумма переплаты, сообщение об отсутствии долга).
        */
        System.out.println("Задание 2");
        Bank yourCredit = new Bank(700);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double credit = yourCredit.credit;
        while (credit > 0) {
            double pay = Double.parseDouble(reader.readLine());
            if (credit > 100 & pay < 100) {
                System.out.println("Ежемесячная сумма платежа должна составлять не меньше 100 грн.");
            } else {
                credit = yourCredit.sumPlat(pay);
            }
        }
        System.out.println("-------------------------------------");

        /*
        Задание 3
        Имеется N клиентов, которым компания производитель должна доставить товар.
        Сколько существует возможных маршрутов доставки товара, с учетом того, что товар будет доставлять одна машина?
        Используя IntelliJ IDEA, создайте класс Delivery.
        Напишите программу, которая будет рассчитывать и выводить на экран количество возможных вариантов доставки товара.
        Для решения задачи, используйте факториал N!, рассчитываемый с помощью рекурсии.
        Объясните, почему не рекомендуется использовать рекурсию для расчета факториала.
        Укажите слабые места данного подхода.
        */

        System.out.println("Задание 3");
        new Delivery().variant();
        System.out.println(new Delivery().variant2(6));
        System.out.println("-------------------------------------");

        /*
        Задание 4
        Используя IntelliJ IDEA, создайте класс Calculator.
        Создайте метод с именем calculate, который принимает в качестве параметров три целочисленных значения
        и возвращает значение каждого аргумента, деленного на 5.
        */
        System.out.println("Задание 4");
        System.out.println(new Calculator(5, 8, 15));
        System.out.println("-------------------------------------");
    }

    static class Bank {
        public double credit;

        public Bank(double credit) {
            this.credit = credit;
        }

        public double sumPlat(double pay) {
            double debt = credit - pay;
            if ((debt > 0)) {
                System.out.println("Cумма задолженности - " + debt);
            } else if (debt == 0) {
                System.out.println("Отсутствие долга");
            } else {
                System.out.println("Сумма переплаты - " + debt);
            }
            credit = debt;
            return credit;
        }
    }

    static class Delivery {
        int customer = 1;

        void variant() {
            for (int i = 1; i <= 6; i++) {
                customer *= i;
            }
            System.out.println(customer);
        }

        int variant2(int x) {
            if (x > 1)
                x *= variant2(x - 1);
            return x;
        }
    }

    static class Calculator {
        double x1;
        double y1;
        double z1;

        public Calculator(int x, int y, int z) {
            x1 = (double) x / 5;
            y1 = (double) y / 5;
            z1 = (double) z / 5;
        }

        @Override
        public String toString() {
            return "Calculator {" +
                    "x1 = " + x1 +
                    ", y1 = " + y1 +
                    ", z1 = " + z1 +
                    '}';
        }
    }


}
