package ch17stream.lecture;

import java.util.List;

public class C08sorted {
    public static void main(String[] args) {

        var list = List.of(3,1,4,5,1,6);
        list.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
