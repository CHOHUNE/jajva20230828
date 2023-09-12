package ch15.collection.lecture;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class C11equals {
    public static void main(String[] args) {

        Set<MyClass11> set = new HashSet<>();
        set.add(new MyClass11("흥민"));
        set.add(new MyClass11("흥민"));
    }
}

class MyClass11{
    String name;

    public MyClass11(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass11 myClass11 = (MyClass11) o;
        return Objects.equals(name, myClass11.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
/*
*메인 클래스에서 서브 클래스 흥민 흥궈 선언 후 equal 하게 만들기
* set add 마이클래스 흥민 흥민
*
* MyClas11
* String name
* 생성자 name */
