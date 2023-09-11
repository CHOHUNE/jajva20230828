package ch13generic.lecture;

public class C11typeParameter {
    public static void main(String[] args) {
        MyClass11<Animal> o1 = new MyClass11<Animal>();
        MyClass11<Dog> o2 = new MyClass11<Dog>();
        MyClass11<Cat> o3 = new MyClass11<Cat>();

    }
}

class MyClass11<T extends Animal> {
    public void method(T param) {
        param.equals(null);
        param.toString();
        param.hashCode();

    }
}


/*
특정 타입의 파라메터를 쓰고 싶다면.
MyClass11 에서 애니멀 메소드를 쓰고 싶다 - 애니멀의 하위 타입으로 제한한다  안전
*/
