import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork4 {
    public static void main(String[] args) throws IOException {

        /*
        Задание 2
        Используя IntelliJ IDEA, создайте класс Calculator. Напишите программу – консольный калькулятор.
        Создайте две переменные с именами operand1 и operand2.
        Задайте переменным некоторые произвольные значения.
        Предложите пользователю ввести знак арифметической операции.
        Примите значение, введенное пользователем и поместите его в строковую переменную sign.
        Для организации выбора алгоритма вычислительного процесса, используйте переключатель switch.
        Выведите на экран результат выполнения арифметической операции. В случае использования операции деления, организуйте проверку попытки деления на ноль.
        И если таковая имеется, то отмените выполнение арифметической операции и уведомите об ошибке пользователя.
        */
        new Calculator().calculator(5, 0);

        /*
        Задание 3
        Используя IntelliJ IDEA, создайте класс Interval.
        Напишите программу определения, попадает ли указанное пользователем число от 0 до 100
        в числовой промежуток [0 - 14] [15 - 35] [36 - 50][50 - 100].
        Если да, то укажите, в какой именно промежуток. Если пользователь указывает число, не входящее ни в один из имеющихся числовых промежутков,
        то выводится соответствующее сообщение.
        */

        new Interval().intervalNumbers();

        /*
        Задание 4
        Используя IntelliJ IDEA, создайте класс Translator.
        Напишите программу русско-английский переводчик.
        Программа знает 10 слов о погоде.
        Требуется, чтобы пользователь вводил слово на русском языке, а программа давала ему перевод этого слова на английском языке.
        Если пользователь ввел слово, для которого отсутствует перевод, то следует вывести сообщение, что такого слова нет.
        */
        new Translator().translator();

    }

    static class Calculator {

        public void calculator(int x, int y) throws IOException {
            System.out.println("Введите знак арифметической операции: ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String sign = reader.readLine();
            int result = 0;
            switch (sign) {
                case "+":
                    result = x + y;
                    break;
                case "-":
                    result = x - y;
                    break;
                case "*":
                    result = x * y;
                    break;
                case "/":
                    if (y == 0) {
                        System.out.println("Exception in thread java.lang.ArithmeticException: / by zero");
                    } else {
                        result = x / y;
                    }
                    break;
                default:
                    System.out.println("Введен не правильный знак для арифметической операции!!");
            }
            System.out.println(result);

        }
    }

    static class Interval {
        public void intervalNumbers() throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int number = Integer.parseInt(reader.readLine());
            if (0 <= number & number <= 14) {
                System.out.println("введенное число попадает в промежуток от 0 до 14 включительно");
            } else if (15 <= number & number <= 35) {
                System.out.println("введенное число попадает в промежуток от 15 до 35 включительно");
            } else if (36 <= number & number <= 50) {
                System.out.println("введенное число попадает в промежуток от 36 до 50 включительно");
            } else if (50 <= number & number <= 100) {
                System.out.println("введенное число попадает в промежуток от 50 до 100 включительно");
            } else {
                System.out.println("введенное число не попадает ни в один из имеющихся числовых промежутков [0 - 14] [15 - 35] [36 - 50][50 - 100]");
            }
        }
    }

    static class Translator {
        void translator() throws IOException {
            System.out.println("Программа знает 10 слов о погоде.");
            System.out.println("Введите слово: ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String str = reader.readLine();
            String translete = "";
            switch (str) {
                case "весна":
                    translete = "spring";
                    break;
                case "лето":
                    translete = "summer";
                    break;
                case "осень":
                    translete = "autumn";
                    break;
                case "зима":
                    translete = "winter";
                    break;
                case "дождь":
                    translete = "rain";
                    break;
                case "снег":
                    translete = "snow";
                    break;
                case "ветер":
                    translete = "wind";
                    break;
                case "солнце":
                    translete = "sun";
                    break;
                case "туман":
                    translete = "fog";
                    break;
                case "мороз":
                    translete = "frost";
                    break;
                default: {
                    translete = "для этого слова перевод отсутствует, в словаре такого слова нет";
                }
            }
            System.out.println(translete);

        }
    }
}
