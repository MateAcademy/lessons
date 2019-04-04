package mate.academy.less04.очередь;

import javax.annotation.Priority;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
 //       Queue<String> queue = new LinkedList<>();

        Queue<Human> queue = new PriorityQueue<>(new HumanComparator());
        Human human1 = new Human(22);
        Human human2 = new Human(25);
        Human human3 = new Human(30);
        Human human4 = new Human(77);
        queue.add(human1);
        queue.add(human2);
        queue.add(human3);
        queue.add(human4);

        System.out.println(queue);

       // queue1.offer(88);

//        queue.add("Dima");
//        queue.add("Sergey");
//        queue.add("Andrey");
//        queue.add("Olya");


//        System.out.println(queue.peek());   //просто достает первый элемент из очереди и не удаляет его
//        System.out.println(queue.peek());
//        System.out.println(queue.poll());   // достает первый элемент из очереди и удаляет его
//        System.out.println(queue.peek());
//
//        System.out.println(queue.element());  //достаем первый элемент  exeption nosuchelemexeption
//
//        Queue<String> queue2 = new LinkedList<>();
//        System.out.println(queue2.peek());          // null
//        System.out.println(queue2.poll());          // null


//        queue.offer("R1");

//        System.out.println(queue.poll());           //достаем первый элемент и удаляем
//        System.out.println(queue.remove());
//        System.out.println(queue.peek());
//
//        System.out.println(queue.peek());
//        System.out.println(queue.peek());           //просто достает первый элемент и не удаляет    возвращает null если очередь пустая
//
//        System.out.println(queue.element());        //достаем первый элемент  exeption nosuchelemexeption
//
//        System.out.println(((LinkedList<String>) queue).get(0));
//
//
//        System.out.println(queue.remove());       //удаляет верхний єлемент и возвращает exeption nosuchelemexeption
//        System.out.println();
//        System.out.println(((LinkedList<String>) queue).get(1));
//        System.out.println(((LinkedList<String>) queue).get(1));



    }
}
