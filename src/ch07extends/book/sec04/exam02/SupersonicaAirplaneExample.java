package ch07extends.book.sec04.exam02;

public class SupersonicaAirplaneExample {
    public static void main(String[] args) {
        SupersonicaAirplane sa = new SupersonicaAirplane();
        sa.takeOff();
        sa.fly();
        sa.flyMode=SupersonicaAirplane.SUPERSONIC;
        sa.fly();
        sa.flyMode=SupersonicaAirplane.NORMAL;
        sa.fly();
        sa.land();
    }
}

// 부모 클래스를 상속 받은 자식 메서드를 상속받은 하위 클래스에서도
// 부모 클래스를 호출할 수 있으며 재정의 할 수도 있다.