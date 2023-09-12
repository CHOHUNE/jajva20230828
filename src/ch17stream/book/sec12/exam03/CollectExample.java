package ch17stream.book.sec12.exam03;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> totalList= new ArrayList<>();
        totalList.add(new Student("홍길동","남",82));
        totalList.add(new Student("홍길동","여",87));
        totalList.add(new Student("홍길동","남",95));
        totalList.add(new Student("홍길동","여",93));

        Map<String,Double> map= totalList.stream()
                .collect(
                        groupingBy(
                                s->s.getSex(),
                                averagingDouble(s->s.getScore())
                        )
                );

        System.out.println(map);
    }
}
