package ch08interface.book.sec11.exam02;

public class Bus implements Vehicle{

    @Override
    public void run() {
        System.out.println("버스가달림");
    }
}