package ch14.thread.lecture;

public class C01sleep {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("code1");
        Thread.sleep(1000);
        System.out.println("code2");
        Thread.sleep(1000);
        System.out.println("code3");
    }
}

/*
*
* thread 클래스- sleep 스태틱 메소드
* Thread.sleep(1000); -> 밀리세컨드 단위
*
* */
