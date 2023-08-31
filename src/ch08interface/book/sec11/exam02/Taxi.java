package ch08interface.book.sec11.exam02;

public class Taxi implements Vehicle{

    @Override
    public void run() {
        System.out.println("택시가달림묭");
    }
}
