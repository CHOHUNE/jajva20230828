package ch17stream.lecture;

import java.util.List;

public class C11sorted {
    public static void main(String[] args) {


        var list = List.of(12, 1123, 12, 3, 123);

        System.out.println("가장 큰 수 ");
        list.stream()
                .sorted((x, y) -> y - x)
                .limit(1)
                .forEach(System.out::println);



    }
}
