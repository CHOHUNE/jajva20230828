package ch17stream.lecture;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class C24grouping {
    public static void main(String[] args) {
        List<String> list = List.of("java", "spring", "css", "html", "react", "vue", "jquery", "jsp");

      Map<Integer, List<String>> collect = list.stream().
              collect(Collectors.groupingBy(String::length));

      collect.entrySet().stream().forEach(s-> System.out.println(s.getKey()+""+ s.getValue()));





    }}


/*

길이별로 그루핑 해서 Map 만들기 -> 만든 Map을 키: 밸류 값으로 콘솔에 출력하기 예제


List Set 외 Map 객체엔 entySet 메서드를 거친 후 stream을 해줘야 한다

스트림의 reduce와 비슷한 최종연산자 컬렉트 추상클래스 ( 컬렉터즈 클래스 - 그루핑 바이 메서드
*/
