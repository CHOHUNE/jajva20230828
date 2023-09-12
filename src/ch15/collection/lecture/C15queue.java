package ch15.collection.lecture;

import java.util.LinkedList;
import java.util.Queue;

public class C15queue {
    public static void main(String[] args) {

  Queue<Integer> queue = new LinkedList<>();
  queue.offer(100);
        System.out.println("queue = " + queue);
  queue.offer(300);
        System.out.println("queue = " + queue);
  queue.offer(500);
        System.out.println("queue = " + queue);

        System.out.println("queue.pekk() = " + queue.peek());

        queue.poll();
        System.out.println("queue = " + queue);
        queue.poll();
        System.out.println("queue = " + queue);
        queue.poll();
        System.out.println("queue = " + queue);

}
}

/*
* queue 선언
* 100 300 500 삽입
* 맨 앞 요소 추출
*
* */