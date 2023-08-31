package ch08interface.book.sec12.exam08;

public class Example {
    private static void action(A a){
        a.method1();
        if(a instanceof C c){ //  a  는  인터페이스 A  객체이다.
            c.method2(); // a의 타입이 C의 인스턴스c였을 때
        }
    }

    public static void main(String[] args) {
        action(new B());
        action(new C());  // 매개변수 칸에는 인터페이스 타입의 A를 이행하는

    }
}


//  a는 인터페이스 A의 객체이다.
// a으 ㅣ타입이 C의 인스턴스 였을때