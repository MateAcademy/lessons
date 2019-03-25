package mate.academy.hw02.sort;

import java.util.Arrays;
import java.util.Scanner;

public class BuubleSort {
    public static void main(String[] args) {

        long t1 = System.nanoTime();

        int counter, num, array[];

        //Создаем объект Scanner для считывания чисел, введенных пользователем
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        num = input.nextInt();

        // Создаем массив введенного пользователем размера
        array = new int[num];

        System.out.println("Введите " + num + " чисел");

        //Заполняем массив, вводя элементы в консоль
        for (counter = 0; counter < num; counter++) {
            array[counter] = input.nextInt();
        }

        // печатаем массив перед пузырьковой сортировкой
        System.out.println("массив перед пузырьковой сортировкой : " + Arrays.toString(array));

        // сортируем массив
        bubbleSort(array);

        // печатаем массив после пузырьковой сортировки
        System.out.println("массив после пузырьковой сортировки : " + Arrays.toString(array));

        System.out.println("Время выполнения программы:  " + (System.nanoTime() - t1) / 1_000_000);
    }

    // метод пузырьковой сортировки
    public static void bubbleSort(int[] num) {

        int j;
        boolean flag = true;   // устанавливаем наш флаг в true для первого прохода по массиву
        int temp;   // вспомогательная переменная
        int p = 0;

        while (flag) {
            flag = false;    // устанавливаем флаг в false в ожидании возможного свопа (замены местами)
            for (j = 0; j < num.length - 1; j++) {
                if (num[j] < num[j + 1]) { // измените на > для сортировки по возрастанию
                    temp = num[j];         // меняем элементы местами
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    flag = true;  // true означает, что замена местами была проведена
                }

            }
            p++; //считаю количество прохождений цикла
        }
        System.out.println("кол-во прохождений цикла Пузыр. сортировки = " + p);


    }

}
