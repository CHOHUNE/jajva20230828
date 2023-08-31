package ch07extends.lecture;

public class C06override {
    public static void main(String[] args) {

        MySubClass061 o1=new MySubClass061();
        o1.method10();;
    }
}

class MySubClass061 extends MyClass06{

    @Override
    // 해당 키워드를 씀으로서 컴파일러가 재정의한 메소드인지 검증해준다.
    public void method10(){
        System.out.println("자식 클래스 메소드");
    }
    //같은 메소드명 같은 접근자 같은 파라메터
}

class MyClass06{
    public void method10(){
        System.out.println("부모클래스 메소드");
    }
}
