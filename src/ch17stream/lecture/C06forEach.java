package ch17stream.lecture;

import java.util.List;

public class C06forEach {
    public static void main(String[] args) {
        List<Integer> list = List.of(3,1,4,10);
        list.stream()
                .forEach(System.out::println);
        //consumer type의 object를 받음
        //accept는 파라메터를 하나 받아서 수행하는 역할의 메서드
    }
}
