package ch17stream.lecture;

import java.util.List;
import java.util.stream.Stream;

public class C01stream {
    public static void main(String[] args) {
        List.of("java","spring","css");
        //읽기 전용 List 생성

        //stream
//        Stream stream = List.stream();

        //메소드
        //중간연산  중간에 여러번  intermediate operation
        //최종연산 : 최종적으로 한 번  terminal operation
        //최종 연산을 할때 중간연산을 일괄적으로 처리한다

         // 최종 연산 후 stream 재사용 불가능

//
//        stream.limit(5); //중간연산
//        stream.count(); // 최종연산 : 마지막 한 번
    }
}
