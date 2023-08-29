package ch08extends.lecture;

public class C07super {
}

class MyClass07{
    void method1(){
        System.out.println(" 부모 클래스 메소드 기능 ");
    }
}

class MySubClass071 extends MyClass07{
    @Override
    void method1() {
        super.method1(); // 부모클래스의 메소드 원래 호출
        //
    }
}