package ch17stream.lecture;

import java.util.List;

public class C09limit {
    public static void main(String[] args) {
        var list = List.of(3,1,2,3,4,5);
        list.stream()
                .sorted()
                .limit(3)
                .forEach(System.out::println);

        //중간연산 순서가 바뀌면 결과 또한 바뀐다

        list.stream()
                .limit(3)
                .sorted()
                .forEach(System.out::println);
    }
}
