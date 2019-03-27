package mate.academy.hw02.sort;

import java.util.Arrays;
import java.util.Scanner;

public class BuubleSort {
    public static void main(String[] args) {

        long t1 = System.nanoTime();

        int counter, num, array[];

        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        num = input.nextInt();

        array = new int[num];

        System.out.println("Введите " + num + " чисел");

        for (counter = 0; counter < num; counter++) {
            array[counter] = input.nextInt();
        }

        System.out.println("массив перед пузырьковой сортировкой : " + Arrays.toString(array));

        bubbleSort(array);

        System.out.println("массив после пузырьковой сортировки : " + Arrays.toString(array));

        System.out.println("Время выполнения программы:  " + (System.nanoTime() - t1) / 1_000_000);
    }

    public static void bubbleSort(int[] num) {

        int j;
        boolean flag = true;
        int temp;
        int p = 0;

        while (flag) {
            flag = false;
            for (j = 0; j < num.length - 1; j++) {
                if (num[j] < num[j + 1]) {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    flag = true;
                }

            }
            p++;
            System.out.println("кол-во прохождений цикла Пузыр. сортировки = " + p);
        }
    }

}
