package ch09nested.book.sec02.exam01;

public class A {

       class B{}

        B field = new B();

       //생성자 안에서도 내부 클래스 객체를 생성할 수 있다.
       A(){
           B b=new B();
        }

        //인스턴스 메소드 : 외부 클래스 안에서 메소드를 생성할 수 있다
        void method(){
           B b = new B();
        }
    }

