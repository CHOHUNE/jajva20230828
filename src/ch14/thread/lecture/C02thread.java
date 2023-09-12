package ch14.thread.lecture;

import java.awt.*;

public class C02thread {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i=0; i<5 ; i++){
            toolkit.beep();
            Thread.sleep(1000);
        }
        for(int i=0; i<5; i++){
            System.out.println("띵");
            Thread.sleep(1000);
        }

    }
}

/* "순차적으로 실행 됨 " -> 쓰레드를 추가해서 동시에하는 것은 다음 예제

쓰레드 sleep 메서드 예제 -> beep이 너무 빨리 울려서 1초 간격 띄우기
* 툴킷?..
*
* */
