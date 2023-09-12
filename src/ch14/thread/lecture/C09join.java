package ch14.thread.lecture;

import ch07.book.sec10.exam01.Phone;

public class C09join {
    public static void main(String[] args) throws InterruptedException {

        Thread t1= new Thread(()->{
            for(int i=0; i<5;i++){
                System.out.println("t1Thread");
            }
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        });
        t1.start();

        try{t1.join();}
        catch(InterruptedException e){
            throw new RuntimeException(e);
        }

        for(int i=0; i<5 ; i++){
            try{ Thread.sleep(1000);}
            catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }
}}

/*

sleep은 Thread를 바로 받는 클래스이다.

start, join은 메서드이다

1.//쓰레드의 종료를 기다리는 join 메서드 예제
쓰레드t1 인스턴스 생성 -> 매개변수로 람다식 러너블 객체전달
( 1~5까지 t1 thread 출력) sleep 500 외 try catch 문 작성 -> 후에 t1.start()
 *
2.//t1.join

3.// 메인 쓰레드 작성 -> for 문 안에 sout mainThread
    try-Thread.sleep(1000)catch


 * */

//join : 쓰레드의 종료를 기다림
         /*메인쓰레드, t1 쓰레드가 동시에 실행되다가
         t1 종료를 메인쓰레드가 기다리며 잠시 멈추고
         t1이 종료 되어서야 비로소 메인쓰레드가 실행된다
        */