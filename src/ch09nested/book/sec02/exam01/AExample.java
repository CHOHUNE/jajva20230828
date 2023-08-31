package ch09nested.book.sec02.exam01;

public class AExample {
    public static void main(String[] args){
        A a = new A();
        A.B b = a.new B(); //A 클래스 안 B  a객체 안에 B타입의 객체 b

    }
}
