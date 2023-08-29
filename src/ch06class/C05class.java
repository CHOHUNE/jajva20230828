package ch06class;

public class C05class {
    public static void main(String[] args) {
        MyClass05 o1 = new MyClass05();
        MyClass05 o2 = new MyClass05();
        o1.age = 30;
        System.out.println("System.identityHasCode(o1) = " + System.identityHashCode(o1));
        System.out.println("o1.age = " + o1.age); //30
        System.out.println("o1.age = " + o2.age);// 9
        o1.model="java"; // 인스턴스 필드 처럼 보여서 권장하지 않음
        MyClass05.model="spring"; //권장되는 작성법

        System.out.println("o1.model = " + o1.model); //spring
        System.out.println("o2.model = " + o2.model); // spring
     }
    
}

class MyClass05 {
    // 속성 : field
    // 그냥 field 라고 하면 대부분 instance field ㄹㄹ 뜻한다 
    int age; // instance field
    //static field, class field, 정적필드 ?
    static String model;


}
