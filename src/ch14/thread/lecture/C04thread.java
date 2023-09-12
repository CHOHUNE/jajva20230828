package ch14.thread.lecture;

import java.awt.*;

public class C04thread {
    public static void main(String[] args) {
        Thread thread1=new Thread();
        thread1.start();
        Thread thread2=new Thread();
        thread2.start();
    }
}


/*메인 클래스 - thread1,2 객체 생성 thread 1,2시작  */


/* 쓰레드 클래스 - 작성시 extends 필수
별도로 클래스 생성시 run 메소드를 Ovverride 해야한다

* beep은  툴킷 클래스의  getDefault 메서드- beep 메서드 이다
*
* */
class YourThread extends Thread{
    @Override
    public void run() {
        Toolkit toolkit= Toolkit.getDefaultToolkit();
        for(int i=0; i<5; i++){
            toolkit.beep();
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }}

class MyThread extends Thread {

    @Override
    public void run() {
        // thread가 해야할 일 작성
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}


/* Thread - start 메서드 : 시작
    쓰레드가 해야할 클래스를 작성법
    thread를 상속
     run  메서드 오버라이딩 : trhead가 해야할 일
* */