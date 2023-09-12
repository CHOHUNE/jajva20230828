package ch17stream.lecture;

import java.util.List;
import java.util.stream.Stream;

public class C05terminal {
    public static void main(String[] args) {

        List<String> list = List.of("css","html","spring");

        list.stream()
                .count();
    }
}
