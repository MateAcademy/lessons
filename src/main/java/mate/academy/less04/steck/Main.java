package mate.academy.less04.steck;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(-4);
        stack.push(3);
        stack.push(5);


//        System.out.println(stack.pop());  //удаляет
        System.out.println(stack.peek());

//        System.out.println(stack.pop());
        System.out.println("значение " + stack.search(-4)); //
        System.out.println(stack);

    }
}
