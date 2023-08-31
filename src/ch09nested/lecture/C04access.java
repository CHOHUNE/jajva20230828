package ch09nested.lecture;

public class C04access {
    //static member는 instance member에 접근이 불가하다
    int instanceField;
    static int staticField;

    static class StaticNestedClass{
    void method1(){
//        System.out.println(instanceFiled);
//        System.out.println(staticField);
    }
    }
    class InnerClass{
    void method1(){
        System.out.println(instanceField); // 인스턴스 메소드 <=> 인스턴스 필드 접근 상호 가능
        System.out.println(staticField);
    }
    }
}
