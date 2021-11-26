import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

public class Lessons_24_11_2021 {
    public static void main(String[] args) {

        /*
        Задание 2

        Используя IntelliJ IDEA, создайте проект. Дано значение числа pi,
        которое равно 3,141592653 и значение числа Эйлера е, которое равно 2,7182818284590452.
        Создайте две переменные, присвойте им значения числа pi и числа е и выведите их на экран без потери точности.
        */
        System.out.println("PI - " + (double) 3.141592653);
        System.out.println(Math.PI);
        System.out.println("-----------------------------");
        System.out.println("1_E  - " + (double) 2.7182818284590452);
        System.out.println(Math.E);
        BigDecimal e = new BigDecimal(2.7182818284590452);
        System.out.println(e);
        System.out.println("-----------------------------");

        /*
        Задание 3

        Используя IntelliJ IDEA, создайте проект. Создайте три строковые переменные и присвойте им значения:
        "\nмоя строка 1"
        "\tмоя строка 2"
        "\aмоя строка 3"
        Выведите значение каждой переменной на экран. Какие отличия вы увидели. Сделайте выводы.
        */

        System.out.println("\nмоя строка 1");
        System.out.println("\tмоя строка 2");
        //System.out.println("\aмоя строка 3");// java: illegal escape character





        /*
        Задание 4

        Используя IntelliJ IDEA, создайте проект. Создайте необходимое количество переменных типа char,
        каждой переменной присвойте значение одного символа в формате UNICODE.
        Выведите в консоль фразу «Здравствуйте, ВАШЕ_ИМЯ !».
        */
        String welcomeName = "Здравствуйте, Viktor !";
        for (int i = 0; i < welcomeName.length(); i++) {
            char s = welcomeName.charAt(i);
            String line = String.format("\\u%04X ", (int) s);
            System.out.println(welcomeName.charAt(i) + " - " + line);
        }

        //char s = '\u0417';
        //System.out.println(s);
    }
}
