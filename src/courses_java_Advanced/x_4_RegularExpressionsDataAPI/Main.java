package courses_java_Advanced.x_4_RegularExpressionsDataAPI;

import courses_java_Advanced.x_4_RegularExpressionsDataAPI.task4.DeamonThread;
import courses_java_Advanced.x_4_RegularExpressionsDataAPI.task4.UserThead;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws ParseException {


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
        while (matcher.find()) {
            text = text.replaceAll(rex, "Java");
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
        Date date = new Date();
        String dateMy = "30-11-1977";
        Date date1 = new SimpleDateFormat("dd-M-yyy", Locale.ENGLISH).parse(dateMy);
        System.out.println("date = " + date.getTime());
        long l = date.getTime() - date1.getTime();

        //System.out.printf("Вам исполнилось %s лет, %s2 месяца, %s3 дней, %s4 часа, %s5 минут и %s6 секунд",c);

        long second = l / (1000);
        long minutes = l / (60 * 1000);
        double hours = l / (60 * 60 * 1000);
        double days = (l / (24 * 60 * 60 * 1000)) /365/12.0;
        long years = (l / (24 * 60 * 60 * 1000)) / 365;


        System.out.println("hours = " + hours);
        System.out.println("days = " + days);
        System.out.println("years = " + years);


        System.out.println("-------------------------------------");


        /*
        Задание 4
        Создайте поток-демон и выведите про него как можно больше информации.
        */
        System.out.println("Задание 4");
        System.out.println("Main thread starts");

        UserThead userThead = new UserThead();
        userThead.setName("user_thread");
        DeamonThread deamonThread = new DeamonThread();
        deamonThread.setName("deamon_thread");
        deamonThread.setDaemon(true);
        System.out.println("deamonThread is daemon = " + deamonThread.isDaemon());
        System.out.println("userThead is daemon = " + userThead.isDaemon());
        /*userThead.start();
        deamonThread.start();*/

        System.out.println("Main thread ends");
        System.out.println("-------------------------------------");

    }
}
