package ch08interface.book.sec12;

public class Bus implements Vehicle {
    public void checkFare() {
        System.out.println("요금확인함둥");
    }

    @Override
    public void run() {
        System.out.println("버스지나감둥");
    }
}
