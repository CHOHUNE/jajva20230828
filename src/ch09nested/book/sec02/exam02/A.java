
package ch09nested.book.sec02.exam02;

public class A {
    class B {
        int field = 1; // 인스턴스 필드
        static int field2 = 2; // 정적필드

        B() {
            System.out.println("B.B");
        } //생성자

        void method1() {
            System.out.println("B.method");
        } // 인스턴스 메소드

        static void method2() {
            System.out.println("B.method2");
        } //정적 메소드
    }

    void useB() {
        //인스턴스 메소드
    // B객체 생성 및 인스턴스 메소드 사용
        B b = new B();
        System.out.println("A.useB");
        b.method1();
    //B클래스의 정적 메소드를 객체 생성 없이 클래스명으로 바로 호출
        System.out.println("A.useB");
        B.method2();
    }
}


