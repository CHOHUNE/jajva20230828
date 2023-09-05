package ch16lambda.lecture;

public class C09methodReference {
    public static void main(String[] args) {
        MyInterace09 o1 = (x,y)-> {};

        // x가 가지고 있는 메서드에 y가 파라메터로 들어간다면?
        MyClass09 o2= new MyClass09();
        MyInterace09 o3= (x,y)-> x.someMethod(y);
        MyInterace09 o4= MyClass09::someMethod;


    }
}

class MyClass09{
    void someMethod(int a){

    }
}
interface MyInterace09{
    void method(MyClass09 x, int y);
}
