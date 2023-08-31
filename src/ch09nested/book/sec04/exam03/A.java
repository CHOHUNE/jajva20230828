package ch09nested.book.sec04.exam03;

public class A {
    public void method(int arg){
        int var=1;
        class B{
            void method2(){
//                System.out.println("var = " + var);
//                System.out.println("arg = " + arg);
//
//                arg=2;
//                var=2;
           }
        }
        B b =new B();
        b.method2();
//
//        arg=3;
//        var=3;
    }
}
