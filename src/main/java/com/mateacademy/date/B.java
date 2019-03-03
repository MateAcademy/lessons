package com.mateacademy.date;

public class B {

    public static void main(String[] args) {
        String[] arr = getNameMonth();
        System.out.println(arr[0]);
    }

    public static String[] getNameWeeks() {
        return new String[] {"Пн", "Вт", "Ср", "Четв", "Пятн", "Субб", "Вс"};
    }

    public static String[] getNameMonth() {
        return new String[] {"Январь", "Февраль", "Март", "Апрель", "Май",
                "Июнь", "Июль", "Август" , "Сентябрь" ,"Октябрь", "Ноябрь", "Декабрь"};
    }
}
