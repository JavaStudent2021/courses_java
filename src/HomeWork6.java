public class HomeWork6 {
    public static void main(String[] args) {

        /*
        Задание 2
        Используя IntelliJ IDEA, создайте класс SumMin.
        Дано два числа A и B (A<B) выведите суму всех чисел, расположенных между данными числами на экран.
        Дано два числа A и B (A<B) выведите все нечетные значения, расположенные между данными числами.
        */
        new SumMin().numberPeriod();
        new SumMin().numberNechet();

        /*
        Задание 3
        Используя IntelliJ IDEA, создайте класс.
        Используя циклы и метод: System.out.print("*"), System.out.print(" "), System.out.print("\n") (для перехода на новую строку).
        Выведите на экран:
         прямоугольник
         прямоугольный треугольник
         равносторонний треугольник
         ромб.
        */

        new Other().rectangle();
        new Other().rhombus();

        /*
        Задание 4
        Имеется N клиентов, которым компания производитель должна доставить товар.
        Сколько существует возможных маршрутов доставки товара, с учетом того, что товар будет доставлять одна машина?
        Используя IntelliJ IDEA, создайте класс Delivery.
        Напишите программу, которая будет рассчитывать, и выводить на экран количество возможных вариантов доставки товара.
        Для решения задачи, используйте факториал N!, рассчитываемый с помощью цикла do-while.
        */

        new Delivery().routeCustomer();

        /*
        Задание 5
        Используя IntelliJ IDEA, создайте класс Rectangle.
        Создайте две целочисленные переменные и задайте им некоторые значения.
        Применяя технику вложенных циклов, нарисуйте прямоугольник из звездочек.
        Используйте значения ранее созданных переменных для указания высоты и ширины прямоугольника.
        */
        new Rectangle().rectangle();

    }

    static class SumMin {
        int a = 5;
        int b = 20;

        void numberPeriod() {
            for (int i = a + 1; i < b; i++) {
                System.out.println("i - " + i);
            }
        }

        void numberNechet() {
            for (int i = a + 1; i < b; i++) {
                if (i % 2 != 0) System.out.println("res -" + i);
            }
        }


    }

    static class Other {
        int x = 5;
        int y = 11;

        void rectangle() {
            for (int i = 0; i < x; i++) {
                System.out.print("\n");

                for (int j = 0; j < y; j++) {
                    System.out.print("*");
                    System.out.print(" ");
                }
            }
        }


        void rhombus() {
            int x = 7;
            int y = 0;
            for (int i = 0; i <= x; i++) {
                System.out.print("\n");
                for (int j = i; j < x; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                    System.out.print(" ");
                }
            }

            for (int i = 0; i <= x; i++) {
                System.out.print("\n");
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int j = x - i; j >= 0; j--) {
                    System.out.print("*");
                    System.out.print(" ");
                }
            }
        }
    }

    static class Delivery {
        int customer = 5;
        int factorialNumber = 1;

        void routeCustomer() {
            do {
                factorialNumber *= customer--;
            } while (customer > 1);
            System.out.println(factorialNumber);
        }
    }

    static class Rectangle {
        int height = 5;
        int width = 10;

        void rectangle() {
            for (int i = 0; i < height; i++) {
                System.out.print("\n");
                for (int j = 0; j < width; j++) {
                    System.out.print(" ");
                    System.out.print("*");
                }
            }
        }

    }
}