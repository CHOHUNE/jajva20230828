package ch17stream.book.ex06;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

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

class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("ㅈㄷㅎ", 20),
                new Member("ㅅㅎㅇ", 25)

        );

        list.stream()
                .map(m -> m.getAge())
                //임의의 변수를 변수.getAge 매핑
                .forEach(System.out::println);

        int sum = list.stream()
                .map(m -> m.getAge())
                .reduce(0, Integer::sum);

        System.out.println("reduce = " + sum);

        int max = list.stream()
                .map(m -> m.getAge())
                .reduce(0, Math::max);

        System.out.println("max = " + max);


//       OptionalDouble age= list.stream()
//                .mapToDouble( m-> m.getAge())
//               .average()
//               .getAsDouble();

        list.stream()
                .mapToDouble(m -> m.getAge())
                .average()
                .getAsDouble();

    }
}
