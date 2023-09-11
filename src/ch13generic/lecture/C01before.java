package ch13generic.lecture;

public class C01before {

    public static void main(String[] args) {

        MyClass01 o1 = new MyClass01();
        o1.setA("java");
        MyClass01 o2 = new MyClass01();
        o2.setA(3);
        MyClass01 o3 = new MyClass01();
        o3.setA(true);

        Object f1 = o1.getA();
        Object f2=o2.getA();
        Object f3=o3.getA();

        Integer i=(Integer) f1;
        String s=(String) f2;
        Double d=(Double) f3;

        // 사람이라면 실수를하고 Integer 을 Long으로 형변환 하는 건 매우 위험하다

    /*
    만약 제네릭이 없었다면 ?
    setA에 String밖에 못넣는데 다른 걸 넣고 싶다?
    setA a를 Object로 바꾼다
     */

    }
}

/*

o1 객체 생성
o1에 setA java
o2  객체 생성
o2에 set 3
o3 객체생성
o3 set true

Object f1 o1 .getA
Object f2 o2.getA

String g1을 f1 스트링 강제변환
인티져ㅑ g2 f2 강제벼ㅑㄴ환


* */

class MyClass01 {
    private Object a;


    public void setA(Object a) {
        this.a = a;
    }

    public Object getA() {
        return a;

    }
}


