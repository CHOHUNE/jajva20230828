package ch08interface.book.ex1;

public class MultiInterfaceImplExample {
    public static void main(String[] args) {
        RemoteControlA rc= new SmartTelevision();
        //RemotControl 인터페이스 변수 선언 및 구현 객체 대입
        //RemoteControl 인터페이스에 선언된 추상 메소드만 호출 가능
        rc.turnOn();
        rc.turnOff();
        // Searchable 인터페이스 변수 선언 및 구현 객체 대입
        Searchable searchable = new SmartTelevision();
        //Searchable 인터페이스 선언된 추상 메서드만 호출 가능
        searchable.search("유튭");
    }
}
