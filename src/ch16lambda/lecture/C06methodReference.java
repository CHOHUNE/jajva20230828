package ch16lambda.lecture;

public class C06methodReference {
    public static void main(String[] args) {
        MyInterface06 o1 = a -> C06methodReference.someMethod(a);
        // 람다식이 특정 메서드 호출로 끝이 난다면

        MyInterface06 o2=C06methodReference::someMethod;
//        MyInterface06 o2= x -> someMethod(x);
//        MyInterface06 o2= new MyInterface06() {
//            @Override
//            public void method(int x) {
//                someMethod(x);
//            }
//        };
//        // 메소드 참조식으로 더욱 줄일 수 있다.
    }
//
    public static void someMethod(int x){}
}

interface MyInterface06{
    void method(int a);
}
