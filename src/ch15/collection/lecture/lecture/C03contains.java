package ch15.collection.lecture.lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class C03contains {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add(new String("java"));
        list1.add(new String("spring"));

        boolean c1 = list1.contains(new String("java"));
        System.out.println("c1 = " + c1); // false? true?

        List<MyClass03> list2 = new ArrayList<>();
        list2.add(new MyClass03("흥민"));
        list2.add(new MyClass03("강인"));

        boolean c2 = list2.contains(new MyClass03("흥민"));
        System.out.println("c2 = " + c2); // false
    }
}

class MyClass03 {
    private String name;

    public MyClass03(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return name != null ? name.hashCode() : 0;
    }
}


// contains 가 true false 로 나뉘는 이유
// contains 는 Objects의 equals 메서드를 사용한다
// equals 메서드는 기본 적으로 두 객체 메모리의 주소 값(참조 값)을 비교하므로 서로 다른 객체인
// 경우 false를 반환 한다.

