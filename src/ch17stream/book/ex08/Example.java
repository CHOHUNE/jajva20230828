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

        Map<String,List<Member>>map= list.stream()
                        .collect(Collectors.groupingBy(m->m.getJob()));
        System.out.println(map);


        System.out.println("개발자");

        list.stream()
                .filter(s->s.getJob().equals("개발자"))
                .toList()
                .forEach(System.out::println);

        list.stream()
                .filter(s->s.getJob().equals("디자이너"))
                .toList()
                .forEach(System.out::println);
    }
}
/* 개발자, 디자이너 나눠서 전부 출력되게 하기

groupinggBy 는 collect(collectors.gruopingBy


*
* */