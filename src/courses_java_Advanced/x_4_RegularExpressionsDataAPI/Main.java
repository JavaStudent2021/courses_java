package courses_java_Advanced.x_4_RegularExpressionsDataAPI;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {


        /*
        Задание 1
        В любой из профильных книг (Хорстман, Эккель) найти соответствующие темы и закрепить материал.
        Использование YouTube, Quizful приветствуется.
        */
        System.out.println("Задание 1");

        System.out.println("-------------------------------------");

        /*
        Задание 2
        Напишите шуточную программу «Дешифратор», которая бы в текстовом файле могла бы заменить все предлоги на слово «Java».
        */
        System.out.println("Задание 2");
        String text = "до вас спробувати за робити завдання на.";
        String rex = "\\b(до|вас|на|за)\\b";

        Pattern pattern = Pattern.compile(rex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            text = text.replaceAll(rex,"Java");
        }
        System.out.println(text);
        System.out.println("-------------------------------------");


        /*
        Задание 3
        Спроектируйте и разработайте метод, определяющий, сколько времени прошло с заданной даты.
        С помощью этого методы выведите в консоль, сколько времени прошло с вашего дня рождения в удобном для восприятия виде,
        например: «Вам исполнилось 20 лет, 3 месяца, 18 дней, 4 часа, 5 минут и 10 секунд».
        */
        System.out.println("Задание 3");
        System.out.println("-------------------------------------");


        /*
        Задание 4
        Создайте поток-демон и выведите про него как можно больше информации.
        */
        System.out.println("Задание 4");
        System.out.println("-------------------------------------");


    }
}
