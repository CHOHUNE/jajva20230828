package ch14.thread.lecture;

import ch07.book.sec10.exam01.Phone;

import java.awt.*;

public class C07lambda {
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
           Toolkit toolkit = Toolkit.getDefaultToolkit();
           for(int i=0; i<3 ; i++){
               toolkit.beep();
               try{
                   Thread.sleep(500);
               }
               catch(InterruptedException e){
                   throw new RuntimeException(e);
               }
           }
        });
        t1.start();

        Thread t2=new Thread(()->{
            for(int i=0 ; i<5 ; i++){
                System.out.println("beep");
            }try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        });
        t2.start();
    }
}


/*
* lambda로 Runnable 인터페이스로 구현하는 방법
* */