package ch14.thread.book.sec05.exam02;

public class JoinExample {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();
        try {
            sumThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
        System.out.println("sumThread.getSum() = " + sumThread.getSum());
    }
}

/*
 * SumThread 인스턴스 객체 생성
 * SumThread start
 *
 * try 부분에 SumThread 가 종료 될때 까지 기다리는 join
 * catch 부문에는 충돌예외  러닝타임 예외 throw new
 *
 * 마지막 필드 : println SumThread.getSum (sum getter)
 * */