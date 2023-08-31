package ch09nested.book.sec04.exam02;

public class A {
void useB(){
    class B{
        int field =1;

        static int field2 =2;

        B(){ //생성자
            System.out.println("B생성자 실행");
        }
        void method1(){
            System.out.println("B메서드1 실행");
        }
        static void method2(){
            System.out.println("B메서드2 실행");
        }
    }

    B b = new B();
    System.out.println(b.field);
    b.method1();
    System.out.println(B.field2);
    B.method2();
}
}

//클래스 A에 메서드 useB 안에