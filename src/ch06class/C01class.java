package ch06class;

public class C01class {
    public static void main(String[] args) {
        MyClass01 o1 = new MyClass01();
        // 클래스가 있어야 인스턴스를 만들 수 있다. 
        // 앞서 배웠듯 o1에 인스턴스 자체가 들어가는 게 아니라 인스턴스 ' 참조값' 이다
        System.out.println("System.identityHashCode(o1) = " + System.identityHashCode(o1));

        System.out.println("o1.age = " + o1.age);
        o1.age=30;
        System.out.println("o1.age = " + o1.age);
        o1.age=60;
        System.out.println("o1.age = " + o1.age);
    }
}

class MyClass01{
    
}
