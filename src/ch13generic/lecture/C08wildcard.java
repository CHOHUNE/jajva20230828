package ch13generic.lecture;

public class C08wildcard {
    public static void main(String[] args) {

    MyClass08<?> o1 = new MyClass08<String>();

    }



    public void otherMethod(){
        someMethod(new MyClass08<Integer>());
        someMethod(new MyClass08<String>());
        someMethod(new MyClass08<Boolean>());
    }
    public void someMethod(MyClass08 <?> para){

    }
}

    class MyClass08<T>{

    }



/*
* psvm - 와일드카드 타입 myclass08 dufjro
*
* T class 08
*
* 썸메소드- 매개변수 마이클래스 제네릭 와일드카드 param
* 아더메소드 - 써멤소드() 매개변수 안 여러 래퍼클래스
* */