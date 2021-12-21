package courses__java_Bases.x_1_oop;

public class OOP {
    public static void main(String[] args) {

        /*
        Задание 1
        В любой из профильных книг (Хорстман, Эккель) найти соответствующие темы и закрепить материал.
        Использование YouTube, Quizful приветствуется.
        */

        /*
        Задание 2
        Используя IDEA, создавайте проект c пакетом. Требуется: Создать класс с именем Rectangle.
        В теле класса создаются два поля, описывающие длины сторон double side1, double side2.
        Создать два метода, вычисляющие площадь прямоугольника – double areaCalculator (double side1, double side2)
        и периметр прямоугольника – double perimeterCalculator (double side1, double side2).
        Написать программу, которая принимает от пользователя длины двух сторон прямоугольника и выводит на экран периметр и площадь.
        */

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.areaCalculator(5, 6));
        System.out.println(rectangle.perimeterCalculator(5, 6));

        /*
        Задание 3
        Используя IDEA, создавайте проект c пакетом. Потребуется: Создать класс Book(Main).
        Создать классы Title, Author и Content, каждый из которых должен содержать одно строковое поле и метод void show().
        Реализуйте возможность добавления в книгу названия книги, имени автора и содержания.
        Выведите на экран с помощью метода show() название книги, имя автора и содержание.
        */
        new Book().show();

        /*
        Задание 4
        Используя IDEA, создавайте проект с пакетом. Создать класс Computer, создать массив объектов Computers размером 5.
        Далее создать 5 экземпляров этого класса и записать в компьютер (используя loop).
        */
        Computer[] computers = new Computer[5];
        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computer();
        }

        /*
        Задание 5
        Используя IDEA, создавайте проект c пакетом. Требуется: Создать класс с именем Address.
        В теле класса требуется создать поля: index, country, city, street, house, apartment.
        Для каждого поля создать метод с двумя методами доступа (get, set) Создать экземпляр класса Address.
        В поле экземпляра записать информацию о почтовом адресе. Выведите на экран значения полей, описывающих адреса.
        */

        Address address = new Address();
        address.setIndex(5);
        address.setCountry("USA");
        address.setCity("Chicago");
        address.setStreet("W 26th St");
        address.setHouse(25);
        address.setApartment(3);
        System.out.println(address);
    }
}
