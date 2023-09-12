package ch17stream.book.sec12.exam01;

import ch17stream.book.sec12.exam02.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("홍길동", "남", 92),
                new Student("김수영", "여", 87),
                new Student("감자바", "남", 95),
                new Student("오해영", "여", 93)
        );
        List<Student> male = list.stream()
                .filter(s -> s.getSex().equals("남"))
                .collect(Collectors.toList());
        Map<String,Integer> collect =list.stream()
                .collect(Collectors.toMap(
                        e->e.getSex(), s->s.getScore()
                ));

    }}





/* Student 리스트 of로 생성
성별이 남자인 리스트 생성 출력
이름,생년인 Map 생성후 출력하기

* Student List  list생성 - of 메서드로 바로 생성자 생성
* Student List male 생성 -> list를 stream -> filter로
* */