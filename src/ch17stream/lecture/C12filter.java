package ch17stream.lecture;

import java.util.List;

public class C12filter {
    public static void main(String[] args) {

        var list = List.of(3,1,4,1,2,3,4);
        list.stream()
                .filter(e-> e %2 == 0)
                .forEach(System.out::println);

        System.out.println("가장작은짞수");

        list.stream()
                .filter(e->e%e==0)
                .sorted()
                .limit(1)
                .forEach(System.out::println);

        System.out.println("홀수 중 가장 큰 값 출력");
        list.stream()
                .filter(e->e%2!=0 && e!=0)
                .sorted((x,y)->y-x)
                .limit(1)
                .forEach(System.out::println);
    }
}
