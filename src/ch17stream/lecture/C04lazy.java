package ch17stream.lecture;

import java.util.List;
import java.util.stream.Stream;

public class C04lazy {
    public static void main(String[] args) {

        List<String> list =List.of("a","b","c");
        Stream<String> stream =list.stream();
        stream.filter((s)-> {
            System.out.println("중간연산 실행중");
            return false;
        })
        .count(); // 최종 연산시 중간 연산 실행



    }
}
