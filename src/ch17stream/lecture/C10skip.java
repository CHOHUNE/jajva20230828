package ch17stream.lecture;

import java.util.List;

public class C10skip {
    public static void main(String[] args) {
        var list= List.of(10,9,12,12,3,2);
        list.stream()
                .sorted()
                .limit(3)

                .skip(list.size()-3)
                .forEach(System.out::println);
    }
}
