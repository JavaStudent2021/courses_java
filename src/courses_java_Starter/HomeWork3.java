package courses_java_Starter;

public class HomeWork3 {
    public static void main(String[] args) {
        /*
            Задание 1

        Имеется 3 переменные типа int x = 10, y = 12, и z = 3;
        Выполните и рассчитайте результат следующих операций для этих переменных:
         x += y - x++ * z;
         z = --x – y * 5;
         y /= x + 5 % z;
         z = x++ + y * 5;
         x = y - x++ * z;
        */
        System.out.println("Задание 1\n");
        int x = 10, y = 12, z = 3;
        x += y - x++ * z;
        System.out.println("x - " + x);
        z = --x - y * 5;
        System.out.println("z - " + z);
        y /= x + 5 % z;
        System.out.println("y - " + y);
        z = x++ + y * 5;
        System.out.println("z - " + z);
        x = y - x++ * z;
        System.out.println("x - " + x);
        System.out.println("--------------------------------------");

        /*
            Задание 2

        Используя IntelliJ IDEA, создайте класс ArithmeticAverage .
        Вычислите среднее арифметическое трех целочисленных значений и выведите его на экран.
        С какой проблемой вы столкнулись?
        Какой тип переменных лучше использовать для корректного отображения результата?
        */
        class ArithmeticAverage {
        }
        System.out.println("Задание 2\n");
        System.out.println((float) (3 + 3 + 4) / 3);
        System.out.println("--------------------------------------");
        /*
            Задание 3

        Используя IntelliJ IDEA, создайте класс Circle. Создайте константу с именем PI (число π «пи»),
        создайте переменную радиус с именем – r. Используя формулу πR2 ,
        вычислите площадь круга и выведите результат на экран.
        */

        class Circle {
            double PI = Math.PI;
            double r = 5;

            public Circle() {
                System.out.println("V = πR2 - " + (float) (PI * r * r));
            }
        }
        System.out.println("Задание 3\n");
        new Circle();
        System.out.println("--------------------------------------");
        /*
            Задание 4

        Используя IntelliJ IDEA, создайте класс Volume.
        Напишите программу расчета объема - V и площади поверхности -S цилиндра.
        Объем V цилиндра радиусом – R и высотой – h, вычисляется по формуле:
        V = πR2 h
        Площадь S поверхности цилиндра вычисляется по формуле: S = 2πR2 + 2πR2 = 2πR(R+h)
        Результаты расчетов выведите на экран.
        */
        class Volume {
            double r;
            double pi = Math.PI;
            double h;

            void volumeCalculation(double r) {
                System.out.println("V = πR2 - " + (float) (this.pi * r * r));
            }

            void surfaceArea(double h, double r) {
                System.out.println("S = 2πR2 + 2πR2 = 2πR(R+h) - " + (float) (2 * this.pi * r * (r + h)));
            }
        }
        System.out.println("Задание 4\n");
        new Volume().volumeCalculation(6);
        new Volume().surfaceArea(4, 6);
        System.out.println("--------------------------------------");
        /*
            Задание 5

        Используя IntelliJ IDEA, создайте класс Main.
        Проверьте, можно ли создать переменные со следующими именами:
        uberflu? , _Identifier , \u006fIdentifier , &myVar , myVariab1le.
        */
        System.out.println("Задание 5\n");
        class Main {
            String uberflu;
            String _Identifier;
            //String  \u006fIdentifier; //java: <identifier> expected
            //String  &myVar;           //java: <identifier> expected
            String myVariab1le;
        }
        System.out.println("--------------------------------------");

        /*
            Задание 6

        Используя IntelliJ IDEA, создайте проект c классом main.
        Создайте две целочисленные переменные и выведите на
        экран результаты всех арифметических операций над этими двумя переменными.
        */
        System.out.println("Задание 6\n");
        int a = 3;
        int b = 5;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println((float) a / b);
        System.out.println(a % b);
        System.out.println("--------------------------------------");
    }
}
