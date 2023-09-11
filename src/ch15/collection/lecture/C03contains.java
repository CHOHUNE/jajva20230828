package ch15.collection.lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class C03contains {
    public static void main(String[] args) {


        List <String> list = new ArrayList<>();
        list.add(new String("흥흥"));
        list.add("홍홍");

        List <MyClass03> list2 = new ArrayList<>();
        list2.add(new MyClass03("흥궈"));
        list2.contains("흥궈");


    }}


/*
*
* MyClass03
*
* */

class MyClass03 {

    String name;
    MyClass03 (String name){
        this.name=name;
    }

    private String getName(){
        return name;
    }
    private void setName(String name){
        this.name=name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass03 myClass03 = (MyClass03) o;
        return Objects.equals(name, myClass03.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}