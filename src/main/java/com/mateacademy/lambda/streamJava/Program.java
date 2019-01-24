package com.mateacademy.lambda.streamJava;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Сергей", 38));
        persons.add(new Person("Даша", 7));
        persons.add(new Person("Глаша", 3));
        persons.add(new Person("Саша", 16));
        persons.add(new Person("Анна", 18));
        persons.add(new Person("Виталик", 40));

//выведем все элементы этой коллекции на экран
        for (Person p : persons) {
            System.out.println(p);
        }

        System.out.println();
        //декларативный подход
//        persons.stream().forEach((Person p)-> System.out.println(p));

//        persons.stream().forEach( p-> System.out.println(p));
        persons.stream().forEach(System.out::println);
        System.out.println();

//я хочу вывести коллекцию где список имен больше 18 лет
//        persons.stream().filter(p -> { return p.getAge() >=18; }).forEach(System.out::println);
        System.out.println("Выведем список совершенолетних людей:");
        persons.stream().filter(p -> p.getAge() >=18).forEach(System.out::println);

        System.out.println();
//медож сортед принимает в качестве параметра компоратор
        System.out.println("проверка отсортировало или нет:");
        persons.stream().filter(p -> p.getAge() >=18).
                sorted((p1, p2) ->p1.getName().compareTo(p2.getName())).
                forEach(System.out::println);

        System.out.println();
//map to позволяет выводить не обьекты класса Персон а только имена
        System.out.println("Выводим только имена:");
        persons.stream().filter(p -> p.getAge() >=0).
                sorted((p1, p2) ->p1.getName().compareTo(p2.getName())).
                map(p -> p.getName() ).
                forEach(System.out::println);


//я хочу узнать средний возраст совершенолетних людей в этом списке ф-ия avarage:
        System.out.println();
        System.out.println("я хочу узнать средний возраст совершенолетних людей:");
        int summa  = 0;
        int adultPersons = 0;
        for (Person p : persons)
            if (p.getAge()>=18) {
                summa += p.getAge();
                adultPersons++;
            }
        double average = (double) summa/adultPersons;
        System.out.println("1-й способ: Средний возраст совершенолетних людей= " + average);

        double average2 = persons.stream().
                filter(p -> p.getAge() >=18).
                mapToInt(p->p.getAge()).
                average().getAsDouble();
        System.out.println("2-й способ: Средний возраст совершенолетних людей= " + average2);

        System.out.println();
        persons.stream().
                filter(p->p.getAge() >=10).
                forEach(System.out::println);

        System.out.println();
        persons.stream().
                filter(p->p.getAge() >=10).
                sorted((p1, p2)->p1.getName().compareTo(p2.getName())).
                forEach(System.out::println);
    }
}
