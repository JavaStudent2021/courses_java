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
        double pay = Double.parseDouble(reader.readLine());
        yourCredit.sumPlat(pay);
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
        new Delivery().variant(5);
        new Delivery().variant2(5);
        System.out.println("-------------------------------------");

        /*
        Задание 4
        Используя IntelliJ IDEA, создайте класс Calculator.
        Создайте метод с именем calculate, который принимает в качестве параметров три целочисленных значения
        и возвращает значение каждого аргумента, деленного на 5.
        */
        System.out.println("Задание 4");
        System.out.println(new Calculator(5, 10, 15));
        System.out.println("-------------------------------------");
    }

    static class Bank {
        private double credit = 700.0;

        public Bank(double credit) {
            this.credit = credit;
            System.out.println("Сумма кредита сотавляет: " + this.credit);
            System.out.println("Введите сумму платежа:");
        }

        void sumPlat(double pay) throws IOException {
            double debt = (getCredit() - pay) > 0 ? (getCredit() - pay) : (getCredit() - pay);
            System.out.println((debt > 0) ? "Cумма задолженности - " + debt :
                    (debt == 0) ? "Отсутствие долга" :
                            "Сумма переплаты - " + debt);
            setCredit(pay);
            System.out.println("Информацию о состоянии кредита: " + getCredit());
        }

        public double getCredit() {
            return credit;
        }

        public void setCredit(double credit) {
            this.credit -= credit;
        }
    }

    static class Delivery {
        int customer = 1;

        void variant(int x) {
            for (int i = 1; i <= x; i++) {
                customer *= i;
            }
            System.out.println(customer);
        }

        void variant2(int x) {
            x--;
            //      if (x>0) customer *= variant2(x);
            System.out.println(customer);
        }
    }

    static class Calculator {
        int x1;
        int y1;
        int z1;

        public Calculator(int x, int y, int z) {
            x1 = x / 5;
            y1 = y / 5;
            z1 = z / 5;
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
