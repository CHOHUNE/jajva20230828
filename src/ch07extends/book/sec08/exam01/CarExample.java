package ch07extends.book.sec08.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar= new Car();
        // Car 객체 생성 - public 이기 때문에 접근 가능
        myCar.tire=new Tire();
        myCar.run();
        //Car 객체 안에 tire 객체가 있음
        // Tire


        myCar.tire = new HankookTire();
        myCar.run();

        myCar.tire=new KumhoTire();
        myCar.run();


    }
}
