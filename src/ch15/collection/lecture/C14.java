package ch15.collection.lecture;

<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> origin/master
import java.util.Stack;

public class C14 {
    public static void main(String[] args) {

<<<<<<< HEAD
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(1);
        stack.push(1);

        stack.peek(); // 맨 위 요소 확인
        stack.pop(); // 맨 위 요소 꺼내기
        stack.isEmpty();


        /*
         * Stack List
         * 9 3번 삽입
         * 크기
         *
         * */
    }

=======

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
>>>>>>> origin/master
}