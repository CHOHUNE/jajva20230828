package ch17stream.lecture;

import java.util.List;
import java.util.stream.Stream;

public class C02stream {
    public static void main(String[] args) {


        List<String>list = List.of("ab","de","xy");
        Stream<String> stream1 = list.stream();
        Stream<String> stringStream = stream1.map(e -> e + e);
        long count= stream1.count();

        list.stream()
                .map(e->e+e) // 중간연산
                .filter(e->e.length() >1) //중간연산
                        .count(); // 최종연산
                        // 위 처럼 연달아 작성이 가능한 이유
                        // return 확장자가 전부 stream이기 때문

    }
}
