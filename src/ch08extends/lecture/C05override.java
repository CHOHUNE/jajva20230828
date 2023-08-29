package ch08extends.lecture;

public class C05override {

    public static void main(String[] args) {
        Myclass05 o1= new Myclass05();

        MySubClass051 o2= new MySubClass051();
        o2.method1();
        o2.method2();
        o1.method1();

    }


}

class Myclass05{
    public void method1(){
        System.out.println("어떤 기능");
    }
}

class MySubClass051 extends Myclass05{
    public void method2(){
        System.out.println("추가된 기능");


    }
    public void method1(){
        System.out.println("변경된 기능");
        // override
    }

}
