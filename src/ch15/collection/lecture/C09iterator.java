package ch15.collection.lecture;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C09iterator {
    public static void main(String[] args) {

        Set<String> set= new HashSet<>();
        set.add("J");
        set.add("S");
        set.add("C");

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String item= iterator.next();
            System.out.println(item);
            iterator.remove();
        }


    }
}
/*
String HashSet
j s c 추가

이터레이터 set
이터레이터 다음 있을시
item 출력 후 remove

set을 String elem에 담기
elem이이 java랑 같으면 set에서 css 지우기

* */