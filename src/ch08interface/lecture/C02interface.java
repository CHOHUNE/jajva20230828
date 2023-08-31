package ch08interface.lecture;

public class C02interface {
    public static void main(String[] args) {
        MyClass021 o1=new MyClass021();
        MyInterface02 i2 = o1;

        MyInterface02 i3 = new MyClass021();

        i3.method1(); // 상위 클래스 구현이 가능하고
            // 실제 재정의한 인스턴스(MyClass021)의 메서드가 실행된다
        MyInterface02 i4 = new MyClass022();
        i4.method1();
        i4.method2();

    }
}

interface MyInterface02{
    abstract public void method1();

    void method2(); // 접근제한자 반환타입을 안적어도 public abstract 이다
}

class MyClass021 implements MyInterface02{

    @Override
    public void method1(){

    }
    @Override
    public void method2(){

    }

}

class MyClass022 implements MyInterface02{

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}