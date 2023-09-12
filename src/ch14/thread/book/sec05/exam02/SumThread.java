package ch14.thread.book.sec05.exam02;

public class SumThread extends Thread{
    private long sum;
    public long getSum(){
        return sum;
    }
    public void setSum(long sum){
        this.sum=sum;
    }

    @Override
    public void run() {
        for( int i=1; i<100; i++){
            sum+=i;
        }
    }
}

/*
* Thread 를 상속 받는 객체 SumThread
*
* long 변수와 게터 세터
* run메서드 오버라이드 1~100 까지 +=
* */