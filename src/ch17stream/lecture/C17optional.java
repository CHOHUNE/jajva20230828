package ch17stream.lecture;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class C17optional {
    public static void main(String[] args) {
        List<Integer>list = List.of(2,3);
        Optional<Integer> sum= list.stream()
                .reduce(Integer::sum);


    }
}



// 반환값이 있어도 되고 없어도 되는 패키지형 인터페이스
// nullpointexception을 미연에 방지하고 null시 치명적인 오류 발생이나
//명확하게 null값을 표기 해줘야 할때 쓰인다
/*
* 인티져 리스트 - of로 2,3
* 옵셔널 인티져로 -스트림 -리듀스
* */