package com.mateacademy.lessons2.home2;

import java.util.Arrays;

public class Stupid_2 {
    public static void main(String[] args) {

        int[] arr = {1, 4, 6, 7, 0, 4, 5, 10};
        for (int i=0; i <arr.length-1; i++) {
            if(arr[i]<arr[i+1]){
                int a = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = a;
                i=-1;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}