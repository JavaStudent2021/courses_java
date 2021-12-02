public class HomeWork9 {
    public static void main(String[] args) {
        /*
        Задание 2
        Используя IntelliJ IDEA, создайте класс CustomerArray.
        Требуется: Создать массив размера N элементов, заполнить его произвольными целыми значениями (размер массива задает пользователь).
        Вывести на экран:
        наибольшее значение массива,
        наименьшее значение массива,
        общую сумму всех элементов,
        среднее арифметическое всех элементов,
        вывести все нечетные значения.
        */
        System.out.println("Задание 2");
        //new CustomerArray().arrayList();
        System.out.println("-------------------------------------");

        /*
        Задание 3
        Используя IntelliJ IDEA, создайте класс ReversedArray.
        Требуется:
        1) Создать метод myReverse(int [] array), который принимает в качестве аргумента
        массив целочисленных элементов и возвращает инвертированный массив (элементы массива в обратном порядке).
        2) Создайте метод int [] subArray(int [] array, int index, int count). Метод возвращает часть полученного в качестве аргумента массива,
        начиная с позиции указанной в аргументе index, размерностью, которая соответствует значению аргумента count.
        Если аргумент count содержит значение больше чем количество элементов,
        которые входят в выбираемую часть исходного массива (от указанного индекса index, до индекса последнего элемента),
        то при формировании нового массива размерностью в count, заполните единицами те элементы,
        которые не были скопированы из исходного массива.
        */
        System.out.println("Задание 3");
        // new ReversedArray().myReverse(new int[]{2, 5, 6, 8, 7, 4, 1});
        System.out.println("-------------------------------------");

        /*
        Задание 4
        Используя IntelliJ IDEA, создайте класс UserArray.
        Требуется: Создать метод, который будет выполнять увеличение длины массива переданного в качестве аргумента, на 1 элемент.
        Элементы массива, должны сохранить свое значение и порядок индексов.
        Создайте метод, который принимает два аргумента, первый аргумент – типа int [] array, второй аргумент – типа int value.
        В теле метода реализуйте возможность добавления второго аргумента метода в массив по индексу 0, при этом длина нового массива,
        должна увеличиться на 1 элемент, а элементы получаемого массива в качестве
        первого аргумента должны скопироваться в новый массив начиная с индекса 1.
        */
        System.out.println("Задание 4");
        new UserArray().userArray(new int[]{2, 5, 6, 8, 7, 4, 1}, 100);
        System.out.println("-------------------------------------");

        /*
        Задание 5
        Используя IntelliJ IDEA, создайте класс Arrays.
        Создайте массив размерностью в 10 элементов, выведите на экран все элементы массива в обратном порядке.
        */
        System.out.println("Задание 5");
        new Arrays(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println();
        System.out.println("-------------------------------------");
    }

    static class CustomerArray {
        void arrayList() {
            int[] arr = new int[7];
            arr[0] = 5;
            arr[1] = 8;
            arr[2] = 1;
            arr[3] = -3;
            arr[4] = 2;
            arr[5] = 10;
            arr[6] = 9;
            int min = 0;
            int max = 0;
            int sumAll = 0;
            for (int i = 0; i < arr.length; i++) {
                int n = arr[i];
                sumAll += n;
                if (min >= n) min = n;
                if (max <= n) max = n;
                if (n < 0) System.out.println("Нечетное значения - " + n);
            }
            System.out.println("max - " + max);
            System.out.println("min - " + min);
            System.out.println("sumAll - " + sumAll);
            System.out.println("middleAr - " + (double) sumAll / arr.length);
        }

    }

    static class ReversedArray {
        int[] myReverse(int[] array) {
            int[] f = new int[array.length];
            int t = 0;
            for (int i = array.length - 1; i >= 0; i--) {
                f[t++] = array[i];
            }
            for (int i = 0; i < f.length; i++) {
                System.out.print(f[i] + "; ");
            }
            System.out.println();
            return f;
        }
    }

    static class UserArray {
        void userArray(int[] ar, int value) {
            int[] newAr = new int[ar.length + 1];
            newAr[0] = value;
            int t = 1;
            for (int i = 0; i < ar.length; i++) {
                newAr[t++] = ar[i];
            }
        }

    }

    static class Arrays {
        public Arrays(int[] ar) {
            for (int i = ar.length - 1; i >= 0; i--) {
                System.out.print(ar[i] + "; ");
            }
        }
    }
}
