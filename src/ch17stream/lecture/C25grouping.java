package ch17stream.lecture;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class C25grouping {
    public static void main(String[] args) {
        List<String> list = List.of("java", "spring", "css", "html", "react", "vue", "jquery", "jsp");

        Map<Integer, Long> map = list.stream()
                .collect(groupingBy(String::length, counting()));


        map.entrySet()
                .forEach( e-> System.out.println(e.getKey()+":"+e.getValue()));
        // key ( type ) : value ( Collect tye : COllect 를 쉽게 만드는 Collectors 가와야함 )
    }
}
