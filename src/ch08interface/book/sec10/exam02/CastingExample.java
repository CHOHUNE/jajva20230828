package ch08interface.book.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();

        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();
        //checkFare 은 Bus 클래스에만 있고 Vehicle 인터페이스에는 없으니 강제 형변환 해서 호출 한다.
    }
}
