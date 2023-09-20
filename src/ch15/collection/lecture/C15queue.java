package ch15.collection.lecture;

import java.util.LinkedList;
import java.util.Queue;

public class C15queue {
    public static void main(String[] args) {

<<<<<<< HEAD
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
=======
    Queue<Integer> queue = new LinkedList<>();
            queue.offer(100);
            queue.offer(200);
            queue.offer(300);

            Integer item1=queue.poll();
        System.out.println("item1 = " + queue.size());
            Integer item2=queue.poll();
        System.out.println("item1 = " + queue.size());
        Integer item3=queue.poll();
        System.out.println("item1 = " + queue.size());


        System.out.println("item3 = " + item3);
        System.out.println("item3 = " + item2);
        System.out.println("item3 = " + item1);
}
}
>>>>>>> origin/master
