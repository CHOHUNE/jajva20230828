package ch17stream.book.ex08;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동","개발자"),
                new Member("김나리","디자이너"),
                new Member("신용권","개발자")
        );

Map<String, List<Member>> map= list.stream()
                .collect(Collectors.groupingBy(s->s.getJob()));


        System.out.println("개발자");

       map.get("개발자").forEach(System.out::println);

       map.get("디자이너").forEach(System.out::println);

       list.stream()
               .filter(s->s.getJob().equals("개발자"))
               .toList()
               .forEach(System.out::println);
       list.stream()
               .filter(m->m.getJob().equals("디자이너"))
               .toList()
               .forEach(System.out::println);

    }
}
/* 개발자, 디자이너 나눠서 전부 출력되게 하기

asList -> Arrays 제공메서드로 List로 변환하게 함

groupinggBy 는 collect(collectors.gruopingBy

멤버클래스 변수를 받는 List 생성 -> 배열을 List로 변환 ( new Member 깩체 생성)



*
* */