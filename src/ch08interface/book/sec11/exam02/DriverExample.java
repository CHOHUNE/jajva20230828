package ch08interface.book.sec11.exam02;

public class DriverExample {
    public static void main(String[] args) {
        Driver dirver= new Driver();
        Bus bus =new Bus();
        Taxi taxi = new Taxi();

        dirver.drive(bus);
        dirver.drive(taxi); // 매개 값으로 구현 객체 대입
    }
}
