package ch17stream.book.ex06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Member {

        private String name;
        private int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}

class Example{
    public static void main(String[] args) {
        List <Member>list =Arrays.asList(
                new Member("홍길동",30),
                new Member("신용권",40),
                new Member("감자바",26)
        );
        list.stream()
                .map( m-> m.getAge())
                //임의의 변수를 변수.getAge 매핑
                .forEach(System.out::println);

        int sum= list.stream()
                .map( m-> m.getAge())
                .reduce(0, Integer::sum);

        System.out.println("reduce = " + sum);

        int max =list.stream()
                .map( m-> m.getAge())
                .reduce(0,Math::max);

        System.out.println("max = " + max);

        int min = list.stream()
                .map( m-> m.getAge())
                .reduce(100,Math::min);

        System.out.println("min = " + min);
    }
}
