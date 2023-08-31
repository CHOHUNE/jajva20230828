package ch09nested.book.sec03.exam02;

public class AExample {
    public static void main(String[] args) {
        A.B b = new A.B ();
        System.out.println("AExample.main");
        b.method1();

        System.out.println("b메서드 2");
        A.B.method2();
    }
}

// 중첩클래스의 아우터인 A안에 B를 객체 생성하여
// 인스턴스 클래스인 mehtod1을 호출하고 있다.
