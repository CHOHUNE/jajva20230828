package ch14.thread.lecture;

import java.util.concurrent.atomic.AtomicInteger;

public class C12atomic {

    private static AtomicInteger value=new AtomicInteger();
    public static void main(String[] args) throws InterruptedException {
        Thread t1= new Thread(()->{
            for(int i=0 ;i<100000;i++){
                value.getAndIncrement();
            }
        });
        t1.start();

        Thread t2 = new Thread( ()->{
            for( int i =0 ; i < 100000 ; i++){
            value.getAndIncrement();
            }
        });
        t2.start();

        t1.join();
        t2.join();

        System.out.println();
    }
}


/* 여러 쓰레드가 동시에 값을 변경하는 것이 불안하다는 것을 보여주는 예제
*해결책 : 안하는 것이 최우선이지만 atomic을 쓴다
* 포인트는 atomicInteger를 기억하라는게 아니라 이런 쓰레드가 동시에 한 객체를
* 변경할 때에 사용할 수 있는 이런 TYPE 들이 있다.
* */