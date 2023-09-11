package ch13generic.lecture;

import java.util.HashMap;

public class C05generic {

    MyClass05<String ,Integer> o1= new MyClass05<String, Integer>();
    HashMap<String,Integer> o2= new HashMap<>();

}

class MyClass05<T,U>{

    T field1;
    U field2;

    public T getField1() {
        return field1;
    }

    public void setField1(T field1) {
        this.field1 = field1;
    }

    public U getField2() {
        return field2;
    }

    public void setField2(U field2) {
        this.field2 = field2;
    }
}





/*

*
    Hashmap
    MyClass05 인티져 스트링 o1
    MyClass05 스트링 인티져



* T U 파라메터 타입 으로 MyClass05
*
* T U 타입 변수 field 1 2
*
* 게터 세터
*
*
* */