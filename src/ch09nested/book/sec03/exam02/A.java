package ch09nested.book.sec03.exam02;

public class A {
    static class B{
        int field1 =1;
        static int field2=2;

        B(){
            System.out.println("B 생성자 실행");
        }
        void method1(){
            System.out.println("B메서드 실행");
        }
        static void method2(){
            System.out.println("B메서드2 실행");
        }
    }
}

// 클래스B는 중첩 클래스 중의 이너클래스 부분이며
// field는 인스턴스 필드이며 인트타입이다.
// field2 는 정적 필드이다.
////B는 생성자이다.
//method1은 인스턴스 메서드이다.
//method2는 정적 인스턴스이다.
// method1은 메서드 안에서 객체를 생성해서 호출해야하며
// method2는 정적 인스턴스이므로 이너클래스인 B를 사용하여 호출할 수 있다.