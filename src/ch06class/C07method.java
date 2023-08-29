package ch06class;

public class C07method {
    public static void main(String[] args) {
        Myclass07 o1 = new Myclass07();
        Myclass07 o2 = new Myclass07();
        o1.myMethod();
        o2.myMethod();

        o1.name="java";
        o2.name="spring";

        o1.printName();
        o2.printName();
    }
}

class Myclass07 {
    String name;

    void printName() {
        System.out.println("name = " + name);
    }

    void myMethod() {
        System.out.println("MyMethod 실행됨");

    }
}