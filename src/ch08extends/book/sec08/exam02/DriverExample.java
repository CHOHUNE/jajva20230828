package ch08extends.book.sec08.exam02;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver=new Driver();
        Bus bus = new Bus();
        driver.drive(bus);

        Taxi taxi = new Taxi();
        driver.drive(taxi);
    }
}

//driver 클래스 drive 메서드엔 Vehicle 객체를 받고 있다. ( Vehicle.run)
// Vehicle 타입이기만 하면 무관하다.
// Bus 와 Taxi는 Vehicle 타입을 상속 받고 있으므로 사용할 수 있다.