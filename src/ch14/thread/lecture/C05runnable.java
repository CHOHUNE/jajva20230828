package ch14.thread.lecture;

import java.awt.*;

public class C05runnable {
    public static void main(String[] args) {
        Runnable r1=new MyRunnable();
        Thread thread1= new Thread(r1);

        thread1 = new Thread(new MyRunnable());
        thread1.start();

        Runnable r2= new YourRunnable();
        Thread thread2=new Thread(r2);
    }

    }

    class YourRunnable implements Runnable{
        @Override
        public void run() {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            for(int i=0; i<5 ; i++){
                toolkit.beep();
                try{
                Thread.sleep(1000);
                }catch(InterruptedException e){
                    throw new RuntimeException(e);
                }
            }
        }
    }
    class MyRunnable implements Runnable{
        @Override
        public void run() {
            for( int i=0; i<5 ; i++){
                System.out.println("띵");
            }
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
