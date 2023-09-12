package ch17stream.lecture;

import java.util.List;

public class C15reduce {
    public static void main(String[] args) {
        var list = List.of(5,1,3);
        list.stream()
                .reduce( 0, (r,e) ->0);

        /*apply(0,5);
        apply(0,1);
        apply(0,3);
        */

        System.out.println("모든 값 더하기");
        Integer reduce1=list.stream()
                .reduce(0,(r,e)->r+e);
        System.out.println("reduce1=" +reduce1);
        // 스트림이 가지고 있는 요소들을 하나의 코드로 압축 하기

        System.out.println("최대값 reduce로 구하기");
        list.stream()
                .reduce(Integer.MIN_VALUE, Math::max);

        list.stream()
                .reduce(Integer.MAX_VALUE,(Math::min));

        var list2 = List.of("ja", "va", " is ", "g", "ood");
        System.out.println("for문으로 문자열 연결");
        String res1 = "";
        for (String e : list2) {
            res1 += e;
        }
        System.out.println("res1 = " + res1);

        System.out.println("stream으로 문자열 연결");
        String reduce4 = list2.stream()
                .reduce("", String::concat);
        System.out.println("reduce4 = " + reduce4);

    }
}
