package ch17stream.lecture;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C18stream {
    public static void main(String[] args) {


//        기존 리스트를 옵셔널 변수로 따로 받기
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        Optional<Integer> list2 = list.stream()
                .reduce((a, b) -> Integer.sum(a, b));

        System.out.println("list2.orElse(0) = " + list2.orElse(0));

//        리스트를 바로 옵셔널로 선언해서 리듀스하기
        Optional<Integer> list3=List.of(1,2,3,4,5,6).stream()
                .reduce(Integer::sum);
        System.out.println("list3.orElse(0) = " + list3.orElse(0));
//      원시타입으로 리스트 선언해서 인스트스트림 후 바로 섬메서드 쓰기
        int sum1=IntStream.of(2,3,4,5,5,6,6,7)
                .sum();
//        인스스트림도 바로 of 가능
    }
}

/*
 * 원시타입 int long double 에는 원시타입 스트림이 적용 가능하다
 * .reduce(x,y-> Integer.sum(x+y)) 이 축약됨
 *
 * of로 불변하는 list 생성
 * optional로 list 받는 stream 생성
 * 후 reduce로 sum 받기
 *
 * 원시타입으로 변수 선언 후 intstream 만든후 바로 stream 메서드 적용
 *
 * orElse는 해당 값이 없으면 0
 * */