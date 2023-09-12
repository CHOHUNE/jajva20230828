package ch17stream.lecture;

import java.util.List;
import java.util.stream.Stream;

public class C21reference {
    public static void main(String[] args) {
//        참조 -> 기본 stream
        List<String>list1= List.of("java","spring","css");
        Integer length = list1.stream()
                .map(String::length)
                .reduce(Integer::sum)
                .get();


    // 참조 타입 ->기본 타입 intStream의 sum을 쓰고 싶다? ->
        Integer max= list1.stream()
                .mapToInt(String::length)
                .sum();





    }
}
