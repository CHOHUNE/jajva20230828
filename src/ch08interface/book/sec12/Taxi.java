package ch08interface.book.sec12;

public class Taxi implements Vehicle{
    @Override
    public void run() {
        System.out.println("택시달림둥");
    }
}
