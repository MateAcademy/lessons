package mate.academy.less03.myLinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("привет");
        myLinkedList.add("я джун");
        myLinkedList.add("пока");

//        LinkedList list = new LinkedList();
//        list.add("hi");
//        list.add("hi2");
        System.out.println(myLinkedList);
    }
}
