package mate.academy.hw01;

import java.util.Arrays;
import java.util.Random;

public class Matrix {
    static Integer[][] arr;

    public static void main(String[] args) {
        arr = createArray(4, 3);
        System.out.println(Arrays.deepToString(arr));
        findMinMax(arr);
    }

    private static Integer[][] createArray(Integer m, Integer n) {
        Integer[][] array = new Integer[m][n];
        Random random = new Random();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = random.nextInt(100);
            }
        }
        return array;
    }

    private static void findMinMax(Integer[][] array) {
        Integer min = array[0][0];
        Integer max = min;

        for (Integer[] i : array) {
            for (int j : i) {
                if (j >= max) {
                    max = j;
                } else if (j <= min) {
                    min = j;
                }
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}