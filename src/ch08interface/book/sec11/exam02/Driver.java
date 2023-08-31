package ch08interface.book.sec11.exam02;

public class Driver {
    void drive (Vehicle vehicle) { // 구현 객체가 대입될 수 있도록 인터페이스 타입으로 선언한다.


        vehicle.run();
    }
}

