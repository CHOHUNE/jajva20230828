package ch15.collection.lecture;

import java.util.Stack;

public class C14 {
    public static void main(String[] args) {


        Stack<Integer> stack = new Stack<>();
        stack.push(9);
        stack.push(9);
        stack.push(9);

        stack.size();
        System.out.println("stack.size() = " + stack.size());
        stack.pop();
        //pop시 pop.size() 1 줄어드는 것을 확인할 수 있다.

        System.out.println("stack.size() = " + stack.size());
        stack.size();
        System.out.println("stack.size() = " + stack.size());

    }
}