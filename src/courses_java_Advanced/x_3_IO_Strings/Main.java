package courses_java_Advanced.x_3_IO_Strings;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {



        /*
        Задание 1
        В любой из профильных книг (Хорстман, Эккель) найти соответствующие темы и закрепить материал.
        Использование YouTube , Quizful приветствуется.
        */
        System.out.println("Задание 1");
        System.out.println("-------------------------------------");

        /*
        Задание 2
        Создайте файл, запишите в него произвольные данные и закройте файл.
        Затем снова откройте этот файл, прочтите из него данные и выведите их на консоль.
        */
        System.out.println("Задание 2");
        String nameFile = "/home/viktor/java/er51.txt";
        FileWriter fileWriter = new FileWriter(nameFile);
        for (int i = 0; i < 10; i++) {
            fileWriter.write(i);
            fileWriter.flush();
        }
        fileWriter.close();
        FileReader fileReader = new FileReader(nameFile);
        while (fileReader.ready()) {
            System.out.println(fileReader.read());
        }
        fileReader.close();
        System.out.println("-------------------------------------");

        /*
        Задание 3
        Нужно сделать строку с текстом (текст взять хоть какой из веба).
        Разбить эту строку на 2 подстроки равной длине и вывести на экран каждое предложение с новой строки.
        */
        System.out.println("Задание 3");
        String str = "Представь, что в твоей программе ты используешь два фреймворка, написанные другими программистами/компаниями. Оба фреймворка очень хорошие и используют принципы ООП: абстракцию, полиморфизм, инкапсуляцию: вместе практически полностью покрывают задачи твоей программы. За тобой осталось простая задача — объекты, которые создает один фреймворк нужно передать во второй. Но оба фреймворка совершенно разные и «не знают друг о друге» — т.е. не имеют общих классов. Тебе нужно как-то преобразовывать объекты одного фреймворка в объекты другого.";

        System.out.println(str.substring(0, str.length() / 2));
        System.out.println(str.substring(str.length() / 2));

        System.out.println("-------------------------------------");


        /*
        Задание 4
        Создайте в package текстовый файл и класс , внесите в файл какой-нибудь текст.
        Выведите на экран содержимое файла.
        */
        System.out.println("Задание 4");
        String nameFile1 = "er51.txt";
        FileWriter fileWriter1 = new FileWriter(nameFile1);
        for (int i = 0; i < 10; i++) {
            fileWriter1.write(i);
            fileWriter1.flush();
        }
        fileWriter1.close();
        FileReader fileReader1 = new FileReader(nameFile1);
        while (fileReader1.ready()) {
            System.out.println(fileReader1.read());
        }
        fileReader1.close();
        System.out.println("-------------------------------------");


    }
}
