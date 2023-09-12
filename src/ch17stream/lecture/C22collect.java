package ch17stream.lecture;

import java.util.*;
import java.util.stream.Collectors;

public class C22collect {
    public static void main(String[] args) {
//        List map set
        List<String>list = List.of("java","spirng","css","html");

        //고전 적인 방법 List -> for -> add.lenth

//        스트림 이용
//        List  map - collect - collectors.toList

        List<Integer> res= list.stream()
                .map(String::length)
                .collect(Collectors.toList());

        Set<Integer> res2= list.stream()
                .map(String::length)
                .collect(Collectors.toSet());

        Map<String,Integer> res3=list.stream()
                .collect(Collectors.toMap(x->x,String::length));

        Map<String,Integer> res4 = list.stream()
                .collect(Collectors.toMap(x->x,String::length));


    }
}
