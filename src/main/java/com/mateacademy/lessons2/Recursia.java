package com.mateacademy.lessons2;

public class Recursia {
    public static void main(String[] args) {
        // 2, 6  18 54
        // 3
        int t = 2, z = 5;
        int otv = getElementGeometryProgression(2, 3, 4);
        System.out.println(otv);
        System.out.println(getElementGeometryProgression(2,3,4));
    }

    static int getElementGeometryProgression(int startElement, int coeff, int number) {
        return (int) (startElement * Math.pow(coeff, number - 1));
    }


    static  void getElementGeometryProgression2(int startElement, int coeff, int number) {
        int a = startElement * coeff;
        number--;
        if (number == 1) {
            System.out.println(startElement);
        } else {
            getElementGeometryProgression(startElement, coeff, number);
        }
    }


}
