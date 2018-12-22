package com.mateacademy.lessons2.home2;

import java.util.Arrays;

public class ShakerSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 8, 0, 99, 5};
        System.out.println(Arrays.toString(arr));

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            for (int i = left; i < right; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
            right--;

            for (int j = right; j > left; j--) {
                if (arr[j] < arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
            left++;
        }
        System.out.println(Arrays.toString(arr));
    }}