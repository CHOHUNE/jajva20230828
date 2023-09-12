package ch17stream.book.sec12.exam02;

import java.util.*;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> totalList= new ArrayList<>();
        totalList.add(new Student("홍길동","남",92));
        totalList.add(new Student("김수영","여",68));
        totalList.add(new Student("감자칩","남",97));
        totalList.add(new Student("김똘똘","여",32));

        //남학생만 묶어서 리스트 생성
        List<Student> maleList= totalList.stream()
                .filter(s-> s.getSex().equals("남"))
                .toList();

        maleList.stream()
                .forEach(s-> System.out.println(s.getName()));

        System.out.println();

        //학생 이름을 키 , 학생의 점수를 값으로 갖는 map
    // Map -> collect
        Map<String,Integer> map= totalList.stream()
                .collect(
                        Collectors.toMap(
                                s->s.getName(),
                                s->s.getScore()
                        )
                );
        System.out.println(map);
        }
    }
