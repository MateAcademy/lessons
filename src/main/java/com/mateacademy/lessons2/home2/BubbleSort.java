package com.mateacademy.lessons2.home2;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {1, 4, 6, 7, 0, 4, 5, 10};

        int p = arr.length-1;
        for (int j=0; j<p; p--){           // for (int j=arr.length-1; j>0; j--)
            for (int i=0; i <p;  i++ ) {
                if(arr[i]>arr[i+1]){
                    int a = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = a;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}