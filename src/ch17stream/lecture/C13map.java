package ch17stream.lecture;

import java.util.List;

public class C13map {
    public static void main(String[] args) {
        var list = List.of(3,1,2,5,7);
        list.stream()
                .map(x->10)
                .forEach(System.out::println); // 위 5개의 원소가 모두 10으로 치환

        list.stream()
                .map(x-> -x)
                .forEach(System.out::println); // 요소를 모두 -로 치환

        //map : 연결짖다 짝을 짖다



        System.out.println("제곱값출력");
        list.stream()
                .map(x->x*x)
                .forEach(System.out::println);

    }
}
